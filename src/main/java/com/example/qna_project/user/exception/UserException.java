package com.example.qna_project.user.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public abstract class UserException extends RuntimeException{

    public UserException(String message) {
        super(message);
    }
    public abstract HttpStatus getStatusCode();
}