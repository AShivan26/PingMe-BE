package com.project.service.adapter.rest;

import com.project.service.BaseUnitTest;
import com.project.service.contract.AuthResponse;
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
                            response.getBody().getUserName(),
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

}


//
//    @Test
//    public void testPingMeLoginNonExistentUser() {
//        RegisterRequestObject registerRequestObject = new RegisterRequestObject("ashivan", "test123");
//        ResponseEntity<RegisterResponseObject> responseEntity = pingMeApiController.pingMeLogin(registerRequestObject);
//        Assertions.assertNotNull(responseEntity);
//        Assertions.assertEquals("400", Objects.requireNonNull(responseEntity.getBody()).getError().getErrorCode());
//        Assertions.assertEquals("User Doesn't Exist", responseEntity.getBody().getError().getMessage());
//        Assertions.assertTrue(responseEntity.getBody().getError().isRetriable());
//        Assertions.assertEquals(HttpStatus.BAD_REQUEST.name(), responseEntity.getBody().getError().getTitle());
//    }
//
//    @Test
//    public void testPingMeLoginExistentUser() {
//        //Data adding in DB
//        RegisterRequestObject registerRequestObject = new RegisterRequestObject("ashivan27", "test123");
//        UserEntity userEntity = new UserEntity();
//        userEntity.setName(registerRequestObject.getUsername());
//        userEntity.setPassword(registerRequestObject.getPassword());
//        userEntity.setOnline(false);
//        userRepository.save(userEntity);
//
//        ResponseEntity<RegisterResponseObject> responseEntity = pingMeApiController.pingMeLogin(registerRequestObject);
//        Assertions.assertNotNull(responseEntity);
//        Assertions.assertNotNull(Objects.requireNonNull(responseEntity.getBody()).getUserId());
//        Assertions.assertNull(responseEntity.getBody().getError());
//    }
//
//    @Test
//    public void testPingMeLogOutExistingUser() {
//        RegisterRequestObject registerRequestObject = new RegisterRequestObject("ashivan2", "test123");
//        UserEntity userEntity = new UserEntity();
//        UUID specificUUID = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
//        userEntity.setId(specificUUID);
//        userEntity.setName(registerRequestObject.getUsername());
//        userEntity.setPassword(registerRequestObject.getPassword());
//        userEntity.setOnline(false);
//        userRepository.save(userEntity);
//
//        ResponseEntity<Boolean> result = pingMeApiController.pingMeLogout(specificUUID);
//        Assertions.assertEquals(Boolean.TRUE, result.getBody());
//    }
//
//    @Test
//    public void testPingMeLogoutNonExistentUser() {
//        ResponseEntity<Boolean> result = pingMeApiController.pingMeLogout(UUID.randomUUID());
//        Assertions.assertEquals(Boolean.FALSE, result.getBody());
//    }
//
//    @Test
//    public void testPingMeGetAllUsers() {
//        RegisterRequestObject registerRequestObject = new RegisterRequestObject("ashivan1", "test123");
//        UserEntity userEntity = new UserEntity();
//        UUID specificUUID = UUID.fromString("123e4567-e89b-12d3-a456-426614174001");
//        userEntity.setId(specificUUID);
//        userEntity.setName(registerRequestObject.getUsername());
//        userEntity.setPassword(registerRequestObject.getPassword());
//        userEntity.setOnline(true);
//        userRepository.save(userEntity);
//
//        RegisterRequestObject secondRegisterRequestObject = new RegisterRequestObject("ashivan9", "test123");
//        UserEntity secondUserEntity = new UserEntity();
//        UUID secondSpecificUUID = UUID.fromString("123e4567-e89b-12d3-a456-426614174002");
//        secondUserEntity.setId(secondSpecificUUID);
//        secondUserEntity.setName(secondRegisterRequestObject.getUsername());
//        secondUserEntity.setPassword(secondRegisterRequestObject.getPassword());
//        secondUserEntity.setOnline(true);
//        userRepository.save(secondUserEntity);
//        List<UserEntity> availableEntities = userRepository.findAll();
//        ResponseEntity<List<UserResponseObject>> listResponseEntity = pingMeApiController.pingMeGetAllUsers(secondSpecificUUID);
//        Assertions.assertNotEquals(0, Objects.requireNonNull(listResponseEntity.getBody()).size());
//    }