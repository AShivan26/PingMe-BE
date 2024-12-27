package com.project.service;

import com.project.service.config.TokenProvider;
import com.project.service.entity.UserEntity;
import com.project.service.exception.ExceptionReason;
import com.project.service.exception.UserException;
import com.project.service.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class HelperServiceImpl implements HelperService {

    private final UserRepository userRepository;

    private final TokenProvider tokenProvider;

    @Override
    public UserEntity findUserProfile(String jwt) throws UserException {
        String email = tokenProvider.getEmailFromToken(jwt);

        if (email == null) {
            log.error("Received invalid token...email is NULL");
            throw new BadCredentialsException("Received invalid token...");
        }

        UserEntity user = this.userRepository.findByEmail(email);

        if (user == null) {
            log.error("User not found with the provided email");
            throw new UserException("User not found with the provided email ", ExceptionReason.USER_NOT_EXIST.name());
        }
        return user;

    }

    @Override
    public UserEntity findUserById(UUID id) throws UserException {
        return this.userRepository.findById(id).orElseThrow(() -> new UserException("The requested user is not found", ExceptionReason.USER_NOT_EXIST.name()));
    }
}
