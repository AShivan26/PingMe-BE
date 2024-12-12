package com.project.service;

import com.project.service.config.TokenProvider;
import com.project.service.entity.UserEntity;
import com.project.service.exception.UserException;
import com.project.service.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class HelperServiceImpl implements HelperService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TokenProvider tokenProvider;

    @Override
    public UserEntity findUserProfile(String jwt) throws UserException {
        String email = tokenProvider.getEmailFromToken(jwt);

        if (email == null) {
            throw new BadCredentialsException("Received invalid token...");
        }

        UserEntity user = this.userRepository.findByEmail(email);

        if (user == null) {
            throw new UserException("User not found with the provided email ");
        }
        return user;

    }

    @Override
    public UserEntity findUserById(UUID id) throws UserException {
        return this.userRepository.findById(id).orElseThrow(() -> new UserException("The requested user is not found"));
    }
}
