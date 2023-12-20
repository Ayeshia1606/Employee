package com.ayeshiat.employeemgrserver.domain.core.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceCreationsException extends RuntimeException {
    public ResourceCreationsException (String message){
        super(message);
    }
}
