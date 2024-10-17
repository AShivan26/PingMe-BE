package com.project.service.adapter.rest;

import com.project.service.BaseUnitTest;
import com.project.service.contract.RegisterRequestObject;
import com.project.service.contract.RegisterResponseObject;
import com.project.service.entity.UserEntity;
import com.project.service.persistence.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Objects;
import java.util.Optional;

public class PingMeApiControllerTest extends BaseUnitTest {
    @Autowired
    private PingMeApiController pingMeApiController;
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testPingMeRegisterNewUser() {
        RegisterRequestObject registerRequestObject = new RegisterRequestObject("ashivan", "test123");
        ResponseEntity<RegisterResponseObject> registerResponseObject = pingMeApiController.pingMeRegister(registerRequestObject);
        Assertions.assertNotNull(Objects.requireNonNull(registerResponseObject.getBody()).getUserId());
        Optional<UserEntity> optionalUserEntity = userRepository.findByName(registerRequestObject.getUsername());
        Assertions.assertTrue(optionalUserEntity.isPresent());
        UserEntity userEntity = optionalUserEntity.get();
        Assertions.assertEquals(registerRequestObject.getUsername(), userEntity.getName());
        Assertions.assertEquals(registerRequestObject.getPassword(), userEntity.getPassword());
    }

    @Test
    public void testPingMeRegisterExistingUser() {
        //Data adding in DB
        RegisterRequestObject registerRequestObject = new RegisterRequestObject("ashivan26", "test123");
        UserEntity userEntity = new UserEntity();
        userEntity.setName(registerRequestObject.getUsername());
        userEntity.setPassword(registerRequestObject.getPassword());
        userEntity.setOnline(true);
        userRepository.save(userEntity);

        ResponseEntity<RegisterResponseObject> registerResponseObject = pingMeApiController.pingMeRegister(registerRequestObject);
        Assertions.assertNull(Objects.requireNonNull(registerResponseObject.getBody()).getUserId());
        Assertions.assertEquals("400", registerResponseObject.getBody().getError().getErrorCode());
        Assertions.assertEquals("UserName is Already Taken", registerResponseObject.getBody().getError().getMessage());
        Assertions.assertFalse(registerResponseObject.getBody().getError().isRetriable());
        Assertions.assertEquals(HttpStatus.BAD_REQUEST.name(), registerResponseObject.getBody().getError().getTitle());
    }
}
