package com.LetsCode.Productservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProducNotFoundException extends Exception {
    public ProducNotFoundException(String msg) {
        super(msg);
    }
}
