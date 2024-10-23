package com.project.service;

import com.project.service.entity.UserEntity;
import com.project.service.exception.UserException;

import java.util.UUID;

public interface HelperService {
    UserEntity findUserProfile(String jwt) throws UserException;

    UserEntity findUserById(UUID id) throws UserException;
}
