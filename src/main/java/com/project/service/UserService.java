package com.project.service;

import com.project.service.config.TokenProvider;
import com.project.service.contract.AuthResponse;
import com.project.service.contract.LoginRequest;
import com.project.service.entity.UserEntity;
import com.project.service.contract.RegisterRequestObject;
import com.project.service.exception.ExceptionReason;
import com.project.service.exception.UserException;
import com.project.service.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private TokenProvider tokenProvider;

    /**
     * @param registerRequestObject
     * @return UserEntity
     */
    public AuthResponse registerUser(RegisterRequestObject registerRequestObject) throws UserException {
        UserEntity user = userRepository.findByEmail(registerRequestObject.getEmail());
        if (user != null) {
            log.error("Email is used with another account, Please use different email Id");
            throw new UserException("Email is used with another account, Please use different email Id", ExceptionReason.EMAIL_UNAVAILABLE.name());
        }
        String email = registerRequestObject.getEmail();
        String name = registerRequestObject.getUsername();
        String password = registerRequestObject.getPassword();
        UserEntity createdUser = new UserEntity();
        createdUser.setEmail(email);
        createdUser.setName(name);
        createdUser.setPassword(this.passwordEncoder.encode(password));
        createdUser.setOnline(true);

        userRepository.save(createdUser);

        Authentication authentication = authenticate(email, password);
        SecurityContextHolder.getContext().setAuthentication(authentication);


        String jwt = this.tokenProvider.generateToken(authentication);
        log.info("Jwt is: {} ", jwt);
        return new AuthResponse(jwt, true, name);
    }

    /**
     * @param loginRequest
     * @return UserEntity
     */
    public AuthResponse loginUser(LoginRequest loginRequest) throws UserException {
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();
        UserEntity user = userRepository.findByEmail(email);
        if (user == null) {
            throw new UserException("User doesn't exist in system", ExceptionReason.USER_NOT_EXIST.name());
        }

        Authentication authentication = this.authenticate(email, password);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = this.tokenProvider.generateToken(authentication);

        user.setOnline(true);
        userRepository.save(user);
        log.info("Jwt is: {} ", jwt);
        return new AuthResponse(jwt, true, user.getName());
    }

    /**
     * @param req
     * @return UserEntity
     */
    public Boolean logOutUser(UserEntity req) {
        UserEntity retrievedEntity = userRepository.findById(req.getId()).orElse(null);
        if (!Objects.isNull(retrievedEntity)) {
            retrievedEntity.setOnline(false);
            userRepository.save(retrievedEntity);
            log.info("logged out successfully ");
            return true;
        } else {
            log.info("Couldn't logout ");
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

    public Authentication authenticate(String username, String password) {
        UserDetails userDetails = loadUserByUsername(username);

        if (userDetails == null) {
            log.error("Invalid username");
            throw new BadCredentialsException("Invalid username");
        }
        if (!passwordEncoder.matches(password, userDetails.getPassword())) {
            log.error("Invalid password or username");
            throw new BadCredentialsException("Invalid password or username");
        }
        log.info("Username authenticated: {}", userDetails.getUsername());
        return new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = this.userRepository.findByEmail(username);
        if (user == null) {
            log.error("User not found with provided username {}", username);
            throw new UsernameNotFoundException("User not found with provided username " + username);
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorities);
    }
}
