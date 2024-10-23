//package com.project.service.adapter.rest;
//
//import com.project.service.BaseUnitTest;
//import com.project.service.contract.RegisterRequestObject;
//import com.project.service.contract.RegisterResponseObject;
//import com.project.service.contract.UserResponseObject;
//import com.project.service.entity.UserEntity;
//import com.project.service.persistence.UserRepository;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import java.util.List;
//import java.util.Objects;
//import java.util.Optional;
//import java.util.UUID;
//
//public class PingMeApiControllerTest extends BaseUnitTest {
//    @Autowired
//    private PingMeApiController pingMeApiController;
//    @Autowired
//    private UserRepository userRepository;
//
//    @Test
//    public void testPingMeRegisterNewUser() {
//        RegisterRequestObject registerRequestObject = new RegisterRequestObject("ashivan", "test123");
//        ResponseEntity<RegisterResponseObject> registerResponseObject = pingMeApiController.pingMeRegister(registerRequestObject);
//        Assertions.assertNotNull(Objects.requireNonNull(registerResponseObject.getBody()).getUserId());
//        Optional<UserEntity> optionalUserEntity = userRepository.findByName(registerRequestObject.getUsername());
//        Assertions.assertTrue(optionalUserEntity.isPresent());
//        UserEntity userEntity = optionalUserEntity.get();
//        Assertions.assertEquals(registerRequestObject.getUsername(), userEntity.getName());
//        Assertions.assertEquals(registerRequestObject.getPassword(), userEntity.getPassword());
//    }
//
//    @Test
//    public void testPingMeRegisterExistingUser() {
//        //Data adding in DB
//        RegisterRequestObject registerRequestObject = new RegisterRequestObject("ashivan26", "test123");
//        UserEntity userEntity = new UserEntity();
//        userEntity.setName(registerRequestObject.getUsername());
//        userEntity.setPassword(registerRequestObject.getPassword());
//        userEntity.setOnline(true);
//        userRepository.save(userEntity);
//
//        ResponseEntity<RegisterResponseObject> registerResponseObject = pingMeApiController.pingMeRegister(registerRequestObject);
//        Assertions.assertNull(Objects.requireNonNull(registerResponseObject.getBody()).getUserId());
//        Assertions.assertEquals("400", registerResponseObject.getBody().getError().getErrorCode());
//        Assertions.assertEquals("UserName is Already Taken", registerResponseObject.getBody().getError().getMessage());
//        Assertions.assertFalse(registerResponseObject.getBody().getError().isRetriable());
//        Assertions.assertEquals(HttpStatus.BAD_REQUEST.name(), registerResponseObject.getBody().getError().getTitle());
//    }
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
//}
