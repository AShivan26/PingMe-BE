package com.project.service;

import com.project.service.entity.UserEntity;
import com.project.service.contract.RegisterRequestObject;
import com.project.service.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
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
        UserEntity retrievedEntity = userRepository.findByNameAndPassword(registerRequestObject.getUsername(), registerRequestObject.getPassword());
        //For New user Just register him to the system
        if (retrievedEntity == null) {
            //Don't Do this,Throw an exception and redirect to register API from Front-End
            return registerUser(registerRequestObject);
        }
        //Make the User Online and Update in DB
        else {
            retrievedEntity.setOnline(true);
            return userRepository.save(retrievedEntity);
        }
    }

    public List<UserEntity> getAllUsers(UUID uuid) {
        ArrayList<UserEntity> findAllByOnline = userRepository.findAllByOnline(true);
        List<UserEntity> filteredList = new ArrayList<>();
        for (UserEntity userEntity : findAllByOnline) {
            if (!userEntity.getId().equals(uuid)) {
                filteredList.add(userEntity);
            }
        }
        return filteredList;
    }
}
