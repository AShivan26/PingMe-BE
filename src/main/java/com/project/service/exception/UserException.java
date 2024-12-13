package com.project.service.exception;

import lombok.Getter;

@Getter
public class UserException extends Exception {
    private final String reason;

    public UserException(String message, String reason) {
        super(message);
        this.reason = reason;
    }
}
