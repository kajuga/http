package com.fedorov.httpserver.io.exception;

import lombok.Getter;

public abstract class AbstractRequestParseFailedException extends HttpServerException {

    @Getter
    private final String startingLine;

    public AbstractRequestParseFailedException(String message, String startingLine) {
        super(message);
        this.startingLine = startingLine;
    }

    public AbstractRequestParseFailedException(Throwable cause, String startingLine) {
        super(cause);
        this.startingLine = startingLine;
    }

    public AbstractRequestParseFailedException(String message, Throwable cause, String startingLine) {
        super(message, cause);
        this.startingLine = startingLine;
    }



}




















