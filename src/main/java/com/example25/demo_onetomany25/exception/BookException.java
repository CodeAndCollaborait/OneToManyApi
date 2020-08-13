package com.example25.demo_onetomany25.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookException extends Exception {

    private static final long serialVersionUID = 1L;

    public BookException(String message){
        super(message);
    }
}