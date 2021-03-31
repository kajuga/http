package com.fedorov.httpserver.io.exception;

public class BadRequestException extends AbstractRequestParseFailedException {

    public BadRequestException(String message, Throwable cause, String startingLine) {
        super(message, cause, startingLine);
        setStatusCode(400);
    }
}
