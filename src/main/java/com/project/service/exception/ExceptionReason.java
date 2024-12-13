package com.project.service.exception;

import lombok.Getter;

@Getter
public enum ExceptionReason {
    USER_NOT_EXIST("USER_NOT_EXIST"),
    USER_NOT_ADMIN("USER_NOT_ADMIN"),
    AUTHENTICATION_FAILED("Authentication failed"),
    FORBIDDEN_ACCESS("FORBIDDEN_ACCESS"),
    MESSAGE_NOT_FOUND("MESSAGE_NOT_FOUND"),
    CHAT_NOT_FOUND("CHAT_NOT_FOUND"),
    EMAIL_UNAVAILABLE("EMAIL_UNAVAILABLE");

    // Getter for the description
    private final String reason;

    // Constructor for the enum to set the reason
    ExceptionReason(String reason) {
        this.reason = reason;
    }

}
