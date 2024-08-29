package com.project.service.adapter.mapper;

import com.project.service.contract.HttpError;
import com.project.service.contract.RegisterResponseObject;
import com.project.service.contract.UserResponseObject;
import com.project.service.domain.HttpErrorDomainObject;
import com.project.service.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DomainToResponseMapper {
    public List<UserResponseObject> PingMeGetAllUsersResponseMapper(List<UserEntity> listOfOnlineUsers) {
        ArrayList<UserResponseObject> userResponseObjectArrayList = new ArrayList<>();
        for (UserEntity userEntity : listOfOnlineUsers) {
            UserResponseObject userResponseObject = new UserResponseObject();
            userResponseObject.setId(userEntity.getId().toString());
            userResponseObject.setName(userEntity.getName());
            userResponseObject.setOnline(userEntity.isOnline());
            userResponseObjectArrayList.add(userResponseObject);
        }
        return userResponseObjectArrayList;
    }

    public RegisterResponseObject PingMeRegisterOrLoginResponseMapper(UserEntity entity) {
        RegisterResponseObject registerResponseObject = new RegisterResponseObject();
        registerResponseObject.setUserId(entity.getId());
        return registerResponseObject;
    }

    public RegisterResponseObject PingMeRegisterOrLoginErrorCaseResponseMapper(HttpErrorDomainObject errorDomainObject) {
        RegisterResponseObject registerResponseObject = new RegisterResponseObject();
        HttpError httpError = new HttpError();
        httpError.title(errorDomainObject.getTitle());
        httpError.message(errorDomainObject.getMessage());
        httpError.errorCode(errorDomainObject.getErrorCode());
        httpError.retriable(errorDomainObject.getRetriable());
        registerResponseObject.setError(httpError);
        return registerResponseObject;
    }
}
