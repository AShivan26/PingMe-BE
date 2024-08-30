package com.project.service.adapter.rest;

import com.project.service.adapter.mapper.DomainToResponseMapper;
import com.project.service.contract.UserResponseObject;
import com.project.service.domain.HttpErrorDomainObject;
import com.project.service.entity.UserEntity;
import com.project.service.contract.RegisterRequestObject;
import com.project.service.contract.RegisterResponseObject;
import com.project.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class PingMeApiController {

    @Autowired
    private UserService userService;

    @Autowired
    private DomainToResponseMapper domainToResponseMapper;

    @PostMapping("/pingme/register")
    public ResponseEntity<RegisterResponseObject> pingMeRegister(@RequestBody RegisterRequestObject registerRequestObject) {
        UserEntity entity = userService.registerUser(registerRequestObject);
        if (entity == null) {
            RegisterResponseObject registerResponseObject =
                    domainToResponseMapper.PingMeRegisterOrLoginErrorCaseResponseMapper(
                            new HttpErrorDomainObject(null,
                                    "400",
                                    "UserName is Already Taken",
                                    Boolean.FALSE,
                                    HttpStatus.BAD_REQUEST.name()));
            return new ResponseEntity<>(registerResponseObject, HttpStatus.BAD_REQUEST);
        }
        RegisterResponseObject registerResponseObject = domainToResponseMapper.PingMeRegisterOrLoginResponseMapper(entity);
        return new ResponseEntity<>(registerResponseObject, HttpStatus.CREATED);
    }

    @GetMapping("/pingme/login")
    public ResponseEntity<RegisterResponseObject> pingMeLogin(@RequestBody RegisterRequestObject registerRequestObject) {
        UserEntity entity = userService.loginUser(registerRequestObject);
        if (Objects.isNull(entity)) {
            RegisterResponseObject registerResponseObject =
                    domainToResponseMapper.PingMeRegisterOrLoginErrorCaseResponseMapper(
                            new HttpErrorDomainObject(null,
                                    "400",
                                    "User Doesn't Exist",
                                    Boolean.TRUE,
                                    HttpStatus.BAD_REQUEST.name()));
            return new ResponseEntity<>(registerResponseObject, HttpStatus.BAD_REQUEST);
        }
        RegisterResponseObject registerResponseObject = domainToResponseMapper.PingMeRegisterOrLoginResponseMapper(entity);
        return new ResponseEntity<>(registerResponseObject, HttpStatus.OK);
    }

    @GetMapping("/pingme/logout/{userid}")
    public ResponseEntity<Boolean> pingMeLogout(@PathVariable UUID userid) {
        Boolean response = userService.logOutUser(userid);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/pingme/users/{userId}")
    public ResponseEntity<List<UserResponseObject>> pingMeGetAllUsers(@PathVariable UUID userId) {
        List<UserEntity> listOfOnlineUsers = userService.getAllUsers(userId);
        List<UserResponseObject> pingMeResponseObjects = domainToResponseMapper.PingMeGetAllUsersResponseMapper(listOfOnlineUsers);
        return new ResponseEntity<>(pingMeResponseObjects, HttpStatus.OK);
    }
}

