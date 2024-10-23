//package com.project.service.adapter.mapper;
//
//import com.project.service.BaseUnitTest;
//import com.project.service.contract.RegisterResponseObject;
//import com.project.service.domain.HttpErrorDomainObject;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//
//
//public class DomainToResponseErrorMapperTest extends BaseUnitTest {
//    @Autowired
//    private DomainToResponseErrorMapper domainToResponseErrorMapper;
//    @Test
//    public void testPingMeRegisterOrLoginErrorCaseResponseMapper() {
//        HttpErrorDomainObject domainObj = new HttpErrorDomainObject(null,
//                "400",
//                "UserName is Already Taken",
//                Boolean.FALSE,
//                HttpStatus.BAD_REQUEST.name());
//        RegisterResponseObject registerResponseObject = domainToResponseErrorMapper.PingMeRegisterOrLoginErrorCaseResponseMapper(domainObj);
//        Assertions.assertNotNull(registerResponseObject);
//        Assertions.assertEquals(HttpStatus.BAD_REQUEST.value(),Integer.parseInt(registerResponseObject.getError().getErrorCode()));
//        Assertions.assertNull(registerResponseObject.getUserId());
//        Assertions.assertNull(registerResponseObject.getError().getData());
//        Assertions.assertEquals("UserName is Already Taken",registerResponseObject.getError().getMessage());
//        Assertions.assertFalse(registerResponseObject.getError().isRetriable());
//        Assertions.assertEquals(HttpStatus.BAD_REQUEST.name(),registerResponseObject.getError().getTitle());
//    }
//    @Test
//    public void testGetUserNameAlreadyTakenErrorResponse(){
//        RegisterResponseObject registerResponseObject = domainToResponseErrorMapper.getUserNameAlreadyTakenErrorResponse();
//        Assertions.assertNotNull(registerResponseObject);
//        Assertions.assertEquals(HttpStatus.BAD_REQUEST.value(),Integer.parseInt(registerResponseObject.getError().getErrorCode()));
//        Assertions.assertNull(registerResponseObject.getUserId());
//        Assertions.assertNull(registerResponseObject.getError().getData());
//        Assertions.assertEquals("UserName is Already Taken",registerResponseObject.getError().getMessage());
//        Assertions.assertFalse(registerResponseObject.getError().isRetriable());
//        Assertions.assertEquals(HttpStatus.BAD_REQUEST.name(),registerResponseObject.getError().getTitle());
//    }
//    @Test
//    public void testGetUserDoesNotExistErrorResponse(){
//        RegisterResponseObject registerResponseObject = domainToResponseErrorMapper.getUserDoesNotExistErrorResponse();
//        Assertions.assertNotNull(registerResponseObject);
//        Assertions.assertEquals(HttpStatus.BAD_REQUEST.value(),Integer.parseInt(registerResponseObject.getError().getErrorCode()));
//        Assertions.assertNull(registerResponseObject.getUserId());
//        Assertions.assertNull(registerResponseObject.getError().getData());
//        Assertions.assertEquals("User Doesn't Exist",registerResponseObject.getError().getMessage());
//        Assertions.assertTrue(registerResponseObject.getError().isRetriable());
//        Assertions.assertEquals(HttpStatus.BAD_REQUEST.name(),registerResponseObject.getError().getTitle());
//    }
//}
