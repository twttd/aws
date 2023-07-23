package com.spyoyo.aws.exceptions;

import java.io.Serial;

public class StringProcessorException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public StringProcessorException(String message, Throwable cause){
        super(message, cause);
    }
}
