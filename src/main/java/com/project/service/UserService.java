package com.project.service;

import com.project.service.entity.UserEntity;
import com.project.service.contract.RegisterRequestObject;
import com.project.service.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

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

        Optional<UserEntity> optionalUserEntity = userRepository.findByName(registerRequestObject.getUsername());
        if (optionalUserEntity.isPresent()) {
            log.info("User already exists");
            return null;
        }
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
        Optional<UserEntity>  retrievedEntity = userRepository.findByNameAndPassword(registerRequestObject.getUsername(), registerRequestObject.getPassword());
        if (retrievedEntity.isEmpty()) {
            log.info("No User with the given credentials exists");
            return null;
        }
        //Make the User Online and Update in DB
        retrievedEntity.get().setOnline(true);
        return userRepository.save(retrievedEntity.get());

    }
    /**
     * @param userId
     * @return UserEntity
     */
    public Boolean logOutUser(UUID userId) {
        UserEntity retrievedEntity = userRepository.findById(userId).orElse(null);
        if (!Objects.isNull(retrievedEntity)) {
            retrievedEntity.setOnline(false);
            userRepository.save(retrievedEntity);
            return true;
        }else {
            return false;
        }
    }
    /**
     * @param uuid
     * @return List of UserEntity except the uuid matching request
     */
    public List<UserEntity> getAllUsers(UUID uuid) {
        return userRepository.findAllByOnline(true).stream()
                .filter(userEntity -> !userEntity.getId().equals(uuid))
                .collect(Collectors.toList());
    }
}
