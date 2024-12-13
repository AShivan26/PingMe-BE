package com.project.service.contract;

import java.time.LocalDateTime;

public class ErrorDetail {

    private String error;
    private String reason;

    private String message;

    private LocalDateTime timeStamp;

    public String getError() {
        return error;
    }
    public String getReason() {return reason;}

    public void setError(String error) {
        this.error = error;
    }
    public void setReason(String reason) {this.reason = reason;}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public ErrorDetail() {
    }

    public ErrorDetail(String error, String message, LocalDateTime timeStamp, String reason) {
        this.error = error;
        this.message = message;
        this.timeStamp = timeStamp;
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "ErrorDetail [error=" + error + ", message=" + message +  ", reason=" + reason + ", timeStamp=" + timeStamp + "]";
    }

}
