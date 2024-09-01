package com.project.service.adapter.rest;

import com.project.service.adapter.mapper.DomainToResponseErrorMapper;
import com.project.service.adapter.mapper.DomainToResponseGetAllUsersMapper;
import com.project.service.adapter.mapper.DomainToResponseLoginRegisterMapper;
import com.project.service.contract.UserResponseObject;
import com.project.service.entity.UserEntity;
import com.project.service.contract.RegisterRequestObject;
import com.project.service.contract.RegisterResponseObject;
import com.project.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class PingMeApiController {

    private final UserService userService;

    private final DomainToResponseLoginRegisterMapper domainToResponseLoginRegisterMapper;

    private final DomainToResponseGetAllUsersMapper domainToResponseGetAllUsersMapper;

    private final DomainToResponseErrorMapper domainToResponseErrorMapper;

    @PostMapping("/pingme/register")
    public ResponseEntity<RegisterResponseObject> pingMeRegister(@RequestBody RegisterRequestObject registerRequestObject) {
        UserEntity entity = userService.registerUser(registerRequestObject);
        if (entity == null) {
            RegisterResponseObject registerResponseObject = domainToResponseErrorMapper.getUserNameAlreadyTakenErrorResponse();
            return new ResponseEntity<>(registerResponseObject, HttpStatus.BAD_REQUEST);
        }
        RegisterResponseObject registerResponseObject = domainToResponseLoginRegisterMapper.PingMeRegisterOrLoginResponseMapper(entity);
        return new ResponseEntity<>(registerResponseObject, HttpStatus.CREATED);
    }


    @PostMapping("/pingme/login")
    public ResponseEntity<RegisterResponseObject> pingMeLogin(@RequestBody RegisterRequestObject registerRequestObject) {
        UserEntity entity = userService.loginUser(registerRequestObject);
        if (Objects.isNull(entity)) {
            RegisterResponseObject registerResponseObject = domainToResponseErrorMapper.getUserDoesNotExistErrorResponse();
            return new ResponseEntity<>(registerResponseObject, HttpStatus.BAD_REQUEST);
        }
        RegisterResponseObject registerResponseObject = domainToResponseLoginRegisterMapper.PingMeRegisterOrLoginResponseMapper(entity);
        return new ResponseEntity<>(registerResponseObject, HttpStatus.OK);
    }

    @PostMapping("/pingme/logout/{userid}")
    public ResponseEntity<Boolean> pingMeLogout(@PathVariable UUID userid) {
        Boolean response = userService.logOutUser(userid);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/pingme/users/{userId}")
    public ResponseEntity<List<UserResponseObject>> pingMeGetAllUsers(@PathVariable UUID userId) {
        List<UserEntity> listOfOnlineUsers = userService.getAllUsers(userId);
        List<UserResponseObject> pingMeResponseObjects = domainToResponseGetAllUsersMapper.PingMeGetAllUsersResponseMapper(listOfOnlineUsers);
        return new ResponseEntity<>(pingMeResponseObjects, HttpStatus.OK);
    }
}

