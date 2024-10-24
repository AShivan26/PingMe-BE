package com.project.service.adapter.mapper;

import com.project.service.contract.UserResponseObject;
import com.project.service.entity.UserEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DomainToResponseGetAllUsersMapper {
    public List<UserResponseObject> PingMeGetAllUsersResponseMapper(List<UserEntity> listOfOnlineUsers) {
        return listOfOnlineUsers.stream()
                .map(userEntity -> {
                    UserResponseObject userResponseObject = new UserResponseObject();
                    userResponseObject.setId(userEntity.getId().toString());
                    userResponseObject.setName(userEntity.getName());
                    userResponseObject.setOnline(userEntity.isOnline());
                    return userResponseObject;
                })
                .collect(Collectors.toList());
    }
}
