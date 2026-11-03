package org.example;

public class ShoeNotFoundException extends Exception {
    public ShoeNotFoundException(String message) {
        super(message);
    }
}