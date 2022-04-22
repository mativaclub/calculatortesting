package com.calculatortesting.calculatortesting.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivideByZeroException extends IllegalArgumentException{
    public DivideByZeroException() {
        super("Error when dividing by zero");
    }
}
