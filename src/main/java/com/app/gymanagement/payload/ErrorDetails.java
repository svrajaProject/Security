package com.app.gymanagement.payload;

import lombok.Getter;

import java.util.Date;

@Getter
public class ErrorDetails {

    private Date timestamp;
    private String message;
    private String datails;

    public ErrorDetails(Date timestamp, String message, String datails) {
        this.timestamp = timestamp;
        this.message = message;
        this.datails = datails;
    }

}
