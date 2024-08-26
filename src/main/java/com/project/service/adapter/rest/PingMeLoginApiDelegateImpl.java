package com.project.service.adapter.rest;

import com.project.service.entity.UserEntity;
import com.project.service.ping_me.domain.api.PingMeLoginApiDelegate;
import com.project.service.ping_me.domain.contract.RegisterRequestObject;
import com.project.service.ping_me.domain.contract.RegisterResponseObject;
import com.project.service.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PingMeLoginApiDelegateImpl implements PingMeLoginApiDelegate {

    UserService userService;

    @Autowired
    public PingMeLoginApiDelegateImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<RegisterResponseObject> pingMeRegister(RegisterRequestObject registerRequestObject) {

        UserEntity entity = userService.registerUser(registerRequestObject);
        RegisterResponseObject registerResponseObject = new RegisterResponseObject();
        registerResponseObject.setUserId(entity.getId());
        return new ResponseEntity<>(registerResponseObject, HttpStatus.CREATED);

    }
}
