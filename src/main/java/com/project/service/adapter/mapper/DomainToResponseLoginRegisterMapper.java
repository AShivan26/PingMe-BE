package com.project.service.adapter.mapper;

import com.project.service.contract.RegisterResponseObject;
import com.project.service.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class DomainToResponseLoginRegisterMapper {

    public RegisterResponseObject PingMeRegisterOrLoginResponseMapper(UserEntity entity) {
        RegisterResponseObject registerResponseObject = new RegisterResponseObject();
        registerResponseObject.setUserId(entity.getId());
        return registerResponseObject;
    }

}
