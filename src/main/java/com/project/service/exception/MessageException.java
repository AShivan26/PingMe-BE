package com.project.service.exception;

import lombok.Getter;

public class MessageException extends Exception {
    @Getter
    private final String reason;
    public MessageException(String message, String reason) {
        super(message);
        this.reason = reason;
    }

}
