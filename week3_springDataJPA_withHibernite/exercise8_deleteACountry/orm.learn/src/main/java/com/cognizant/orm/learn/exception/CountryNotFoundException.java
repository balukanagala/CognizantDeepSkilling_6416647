package com.cognizant.orm.learn.exception;

public class CountryNotFoundException extends RuntimeException {
    // Optional: default constructor
    public CountryNotFoundException() {
        super("Country not found");
    }
}
