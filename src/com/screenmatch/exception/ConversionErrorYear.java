package com.screenmatch.exception;

public class ConversionErrorYear extends RuntimeException {
    private final String message;

    public ConversionErrorYear(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
