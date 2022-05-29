package com.LetsCode.Productservice.exception;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(String msg) {
    super(msg);

    }
}
