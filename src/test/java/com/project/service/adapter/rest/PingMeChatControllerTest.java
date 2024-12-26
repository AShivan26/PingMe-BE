package com.project.service.adapter.rest;

import com.project.service.BaseUnitTest;
import com.project.service.contract.AuthResponse;
import com.project.service.contract.LoginRequest;
import com.project.service.contract.SingleChatRequestObject;
import com.project.service.entity.ChatEntity;
import com.project.service.exception.ExceptionReason;
import com.project.service.exception.UserException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Objects;
import java.util.UUID;

class PingMeChatControllerTest extends BaseUnitTest {
    @Autowired
    private PingMeChatController pingMeChatController;
    @Autowired
    private PingMeApiController pingMeApiController;

    String jwtToken = "Bearer ";

    @BeforeAll
    public void getJWTForUser() throws UserException {
        LoginRequest loginRequestObject = new LoginRequest(
                "test1@gmail.com",
                "secret1");
        ResponseEntity<AuthResponse> response = pingMeApiController.pingMeLogin(loginRequestObject);
        jwtToken += Objects.requireNonNull(response.getBody()).getJwt();
    }

    @Nested
    class logOutTestClass {

        @Test
        public void testPingMeLogoutSuccess() throws UserException {
            ResponseEntity<Boolean> logoutResponse = pingMeChatController.pingMeLogout(jwtToken);
            Assertions.assertEquals(Boolean.TRUE, logoutResponse.getBody());
        }
    }

    @Nested
    class singleChatTestClass {
        @Test
        public void testCreateChatSingle() throws UserException {
            UUID toUUID = UUID.fromString("50b35861-d3cd-40b2-8c3b-606b673e1e51");
            SingleChatRequestObject singleChatRequest = new SingleChatRequestObject(toUUID);
            ResponseEntity<ChatEntity> createChatResponse = pingMeChatController.createChat(singleChatRequest, jwtToken);
            Assertions.assertAll("Validate Create Chat Endpoint",
                    () -> Assertions.assertEquals(HttpStatus.CREATED, createChatResponse.getStatusCode()),
                    () -> Assertions.assertNotNull(Objects.requireNonNull(createChatResponse.getBody()).getId()),
                    () -> Assertions.assertFalse(Objects.requireNonNull(createChatResponse.getBody()).isGroup()),
                    () -> Assertions.assertAll("Validating createdBy in response",
                            () -> Assertions.assertEquals("50b35861-d3cd-40b2-8c3b-606b673e1e50", Objects.requireNonNull(createChatResponse.getBody()).getCreatedBy().getId().toString()),
                            () -> Assertions.assertEquals("Michael", Objects.requireNonNull(createChatResponse.getBody()).getCreatedBy().getName()),
                            () -> Assertions.assertEquals("mscott_profile", Objects.requireNonNull(createChatResponse.getBody()).getCreatedBy().getProfile()),
                            () -> Assertions.assertTrue(Objects.requireNonNull(createChatResponse.getBody()).getCreatedBy().isOnline()),
                            () -> Assertions.assertEquals("test1@gmail.com", Objects.requireNonNull(createChatResponse.getBody()).getCreatedBy().getEmail())),
                    () -> Assertions.assertEquals(2, Objects.requireNonNull(createChatResponse.getBody()).getUsers().size())
            );
        }

        @Test
        public void testCreateChatSingleException() {
            UUID toUUID = UUID.fromString("50b35861-d3cd-40b2-8c3b-606b673e1e59");
            SingleChatRequestObject singleChatRequest = new SingleChatRequestObject(toUUID);
            UserException exception = Assertions.assertThrowsExactly(UserException.class, () -> pingMeChatController.createChat(singleChatRequest, jwtToken));
            Assertions.assertAll("Validate Exception case",
                    () -> Assertions.assertEquals("To User Doesn't exist", exception.getMessage()),
                    () -> Assertions.assertEquals(ExceptionReason.USER_NOT_EXIST.name(), exception.getReason())
            );
        }


    }

}
