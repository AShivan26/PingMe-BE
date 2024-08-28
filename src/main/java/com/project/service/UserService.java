package com.project.service;

import com.project.service.entity.UserEntity;
import com.project.service.contract.RegisterRequestObject;
import com.project.service.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserEntity registerUser(RegisterRequestObject registerRequestObject){

        UserEntity userEntity = new UserEntity();
        userEntity.setName(registerRequestObject.getUsername());
        userEntity.setPassword(registerRequestObject.getPassword());
        userEntity.setOnline(true);
        log.info("Created User {}", userEntity.getId());
        return userRepository.save(userEntity);
    }
}
