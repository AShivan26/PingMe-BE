package com.project.service.service;

import com.project.service.entity.UserEntity;
import com.project.service.persistence.UserRepository;
import com.project.service.ping_me.domain.contract.RegisterRequestObject;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity registerUser(RegisterRequestObject registerRequestObject){

        UserEntity userEntity = new UserEntity();
        userEntity.setName(registerRequestObject.getUsername());
        userEntity.setPassword(registerRequestObject.getPassword());
        userEntity.setOnline(true);
        log.info("Created User {}", userEntity.getId());
        return userRepository.save(userEntity);
    }
}
