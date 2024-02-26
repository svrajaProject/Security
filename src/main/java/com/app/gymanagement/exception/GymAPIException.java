package com.app.gymanagement.exception;

import org.springframework.http.HttpStatus;

public class GymAPIException extends RuntimeException {

    private HttpStatus status;
    private String message;

    public GymAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public GymAPIException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}