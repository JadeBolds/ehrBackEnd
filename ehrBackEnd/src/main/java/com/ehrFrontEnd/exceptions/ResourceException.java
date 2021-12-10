package com.ehrFrontEnd.exceptions;

import org.springframework.http.HttpStatus;

public class ResourceException extends RuntimeException{
    static final long serialVersionUID = 1;

    private final HttpStatus httpStatus;

    public ResourceException(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public ResourceException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public ResourceException(String message, Throwable cause, HttpStatus httpStatus) {
        super(message, cause);
        this.httpStatus = httpStatus;
    }

    public ResourceException(Throwable cause, HttpStatus httpStatus) {
        super(cause);
        this.httpStatus = httpStatus;
    }

    public ResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, HttpStatus httpStatus) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.httpStatus = httpStatus;
    }
}
