package com.project.service.adapter.rest;

import com.project.service.contract.*;
import com.project.service.UserService;

import com.project.service.exception.UserException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/auth")
public class PingMeApiController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> pingMeRegister(@RequestBody RegisterRequestObject registerRequestObject) throws UserException {
        AuthResponse response = userService.registerUser(registerRequestObject);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> pingMeLogin(@RequestBody LoginRequest loginRequest) throws UserException {
        AuthResponse response = userService.loginUser(loginRequest);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }
}

