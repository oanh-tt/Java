package com.oneID;

public class NumberCheckingException extends Exception {
    NumberCheckingException(String s) {
        super(s);
    }

    @Override
    public String getMessage() {
        return "Input number error: " + super.getMessage();
    }
}