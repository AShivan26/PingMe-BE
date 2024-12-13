package com.project.service.exception;

import lombok.Getter;

@Getter
public class ChatException extends Exception {
    private final String reason;
    public ChatException(String message, String reason) {
        super(message);
        this.reason = reason;
    }

}
