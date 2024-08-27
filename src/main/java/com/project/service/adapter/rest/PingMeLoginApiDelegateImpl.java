package com.project.service.adapter.rest;

import com.project.service.entity.UserEntity;
import com.project.service.entity.contract.RegisterRequestObject;
import com.project.service.entity.contract.RegisterResponseObject;
import com.project.service.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PingMeLoginApiDelegateImpl {

    private final UserService userService;  // Make this final to use @RequiredArgsConstructor

    @PostMapping("/pingme/register")
    public ResponseEntity<RegisterResponseObject> pingMeRegister(@RequestBody RegisterRequestObject registerRequestObject) {
        UserEntity entity = userService.registerUser(registerRequestObject);
        RegisterResponseObject registerResponseObject = new RegisterResponseObject();
        registerResponseObject.setUserId(entity.getId());
        return new ResponseEntity<>(registerResponseObject, HttpStatus.CREATED);
    }
}

