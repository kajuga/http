package com.fedorov.httpserver.io.exception;

public class HttpVersionNotSupportedException extends AbstractRequestParseFailedException{
    private static final long serialVersionUID = 58248914028283839L;

    public HttpVersionNotSupportedException(String message, String startingLine) {
        super(message, startingLine);
        setStatusCode(505);
    }
}
