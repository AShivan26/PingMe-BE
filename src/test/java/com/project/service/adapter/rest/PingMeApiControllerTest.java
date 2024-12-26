package com.project.service.adapter.rest;

import com.project.service.BaseUnitTest;
import com.project.service.contract.AuthResponse;
import com.project.service.contract.LoginRequest;
import com.project.service.contract.RegisterRequestObject;
import com.project.service.exception.ExceptionReason;
import com.project.service.exception.UserException;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Objects;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PingMeApiControllerTest extends BaseUnitTest {

    @Autowired
    private PingMeApiController pingMeApiController;

    @Nested
    class registerTestClass {

        @ParameterizedTest
        @MethodSource("provideNewRegisterUsers")
        void testPingMeRegisterNewUser(RegisterRequestObject registerRequestObject) throws UserException {
            ResponseEntity<AuthResponse> response = pingMeApiController.pingMeRegister(registerRequestObject);

            Assertions.assertAll(
                    "Validating register response",
                    () -> Assertions.assertEquals(HttpStatus.CREATED, response.getStatusCode(),
                            "Unexpected status code"),
                    () -> Assertions.assertTrue(
                            Objects.requireNonNull(response.getBody()).isAuth(),
                            "User should be authenticated (will be evaluated)"),
                    () -> Assertions.assertTrue(
                            () -> Objects.requireNonNull(response.getBody()).isAuth(),
                            () -> "User should be authenticated (conditionally/lazily evaluated)"
                    ),
                    () -> Assertions.assertEquals(
                            registerRequestObject.getUsername(),
                            Objects.requireNonNull(response.getBody()).getUserName(),
                            "Username mismatch"
                    )
            );
        }

        private static Stream<RegisterRequestObject> provideNewRegisterUsers() {
            RegisterRequestObject registerRequestObject1 = new RegisterRequestObject(
                    "ashivan@gmail.com",
                    "ashivan",
                    "ashivan_profile",
                    "secret_ashivan");

            RegisterRequestObject registerRequestObject2 = new RegisterRequestObject(
                    "aniruddha@gmail.com",
                    "Aniruddha",
                    "ani_profile",
                    "secret_aniruddha");

            return Stream.of(registerRequestObject1, registerRequestObject2);
        }

        @DisplayName("I can be renamed unlike you \uD83D\uDE05")
        @Test
        void testPingMeRegisterExistingUser() {
            RegisterRequestObject registerRequestObject = new RegisterRequestObject(
                    "test1@gmail.com",
                    "ashivan",
                    "ashivan_profile",
                    "secret1");

            UserException exception = Assertions.assertThrowsExactly(UserException.class,
                    () -> pingMeApiController.pingMeRegister(registerRequestObject));

            Assertions.assertAll(
                    "Validating Register Existing User",
                    () -> Assertions.assertEquals("Email is used with another account, Please use different email Id",
                            exception.getMessage()),
                    () -> Assertions.assertEquals(ExceptionReason.EMAIL_UNAVAILABLE.name(),
                            exception.getReason())

            );
        }
    }

    @Nested
    class loginTestClass {
        @Test
        public void testPingMeLoginNonExistentUser() {
            LoginRequest loginRequest = new LoginRequest(
                    "test4@gmail.com",
                    "secret1");
            UserException exception = Assertions.assertThrowsExactly(UserException.class, () -> pingMeApiController.pingMeLogin(loginRequest));

            Assertions.assertAll(
                    "Validating non existing login user",
                    () -> Assertions.assertEquals("User doesn't exist in system", exception.getMessage()),
                    () -> Assertions.assertEquals(ExceptionReason.USER_NOT_EXIST.name(), exception.getReason())
            );
        }

        @ParameterizedTest
        @MethodSource("provideExistingLoginUsers")
        public void testPingMeLoginExistentUser(LoginRequest loginRequest) throws UserException {

            ResponseEntity<AuthResponse> responseEntity = pingMeApiController.pingMeLogin(loginRequest);
            Assertions.assertAll("Validating exsisting user through login",
                    () -> Assertions.assertNotNull(responseEntity),
                    () -> Assertions.assertNotNull(Objects.requireNonNull(responseEntity.getBody()).getUserName()),
                    () -> Assertions.assertNotNull(Objects.requireNonNull(responseEntity.getBody()).getJwt()),
                    () -> Assertions.assertTrue(
                            () -> Objects.requireNonNull(responseEntity.getBody()).isAuth(),
                            () -> "User should be authenticated (conditionally/lazily evaluated)"
                    ));
        }

        private static Stream<LoginRequest> provideExistingLoginUsers() {
            LoginRequest loginRequestObject1 = new LoginRequest(
                    "test1@gmail.com",
                    "secret1");
            LoginRequest loginRequestObject2 = new LoginRequest(
                    "test2@gmail.com",
                    "secret2");

            return Stream.of(loginRequestObject1, loginRequestObject2);

        }
    }
}