package com.example.demo.common.exception;

public class ValidationException extends RuntimeException {
    private static final String DESCRIPTION = "Validation Exception";

    public ValidationException(String message) {
        super(DESCRIPTION + ". " + message);
    }
    
}
