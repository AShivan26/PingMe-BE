package com.project.service.adapter.rest;

import com.project.service.adapter.mapper.DomainToResponseGetAllUsersMapper;
import com.project.service.contract.*;
import com.project.service.entity.UserEntity;
import com.project.service.UserService;

import com.project.service.exception.UserException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/auth")
public class PingMeApiController {

    private final UserService userService;

    private final DomainToResponseGetAllUsersMapper domainToResponseGetAllUsersMapper;



    @PostMapping("/register")
    public ResponseEntity<AuthResponse> pingMeRegister(@RequestBody RegisterRequestObject registerRequestObject) throws UserException {
        AuthResponse response = userService.registerUser(registerRequestObject);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }


    @PostMapping("/login")
    public ResponseEntity<AuthResponse> pingMeLogin(@RequestBody LoginRequest loginRequest) {
        AuthResponse response = userService.loginUser(loginRequest);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }





    //Do we need these???
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

