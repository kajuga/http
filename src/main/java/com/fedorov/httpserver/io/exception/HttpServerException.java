package com.fedorov.httpserver.io.exception;

import lombok.Getter;
import lombok.Setter;

public class HttpServerException extends RuntimeException {
    @Getter
    @Setter
    private int statusCode = 500;


    public HttpServerException(String message) {
        super(message);
    }

    public HttpServerException(Throwable cause) {
        super(cause);
    }

    public HttpServerException(String message, Throwable cause) {
        super(message, cause);
    }


}
