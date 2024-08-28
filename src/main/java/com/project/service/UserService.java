package com.project.service;

import com.project.service.entity.UserEntity;
import com.project.service.contract.RegisterRequestObject;
import com.project.service.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * @param registerRequestObject
     * @return UserEntity
     */
    public UserEntity registerUser(RegisterRequestObject registerRequestObject) {

        UserEntity userEntity = new UserEntity();
        userEntity.setName(registerRequestObject.getUsername());
        userEntity.setPassword(registerRequestObject.getPassword());
        userEntity.setOnline(true);
        log.info("Created User {}", userEntity.getId());
        return userRepository.save(userEntity);
    }

    /**
     * @param registerRequestObject
     * @return UserEntity
     */
    public UserEntity loginUser(RegisterRequestObject registerRequestObject) {
        UserEntity retrievedEntity = userRepository.findByNameAndPassword(registerRequestObject.getUsername(), registerRequestObject.getPassword());
        //For New user Just register him to the system
        if (retrievedEntity == null) {
            return registerUser(registerRequestObject);
        }
        //Make the User Online and Update in DB
        else {
            retrievedEntity.setOnline(true);
            return userRepository.save(retrievedEntity);
        }
    }
}
