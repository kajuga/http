package com.fedorov.httpserver.io.exception;

public class HttpServerConfigException extends HttpServerException {
    private static final long serialVersionUID = -623123842963448404L;



    public HttpServerConfigException(String message) {
        super(message);
    }

    public HttpServerConfigException(Throwable cause) {
        super(cause);
    }

    public HttpServerConfigException(String message, Throwable cause) {
        super(message, cause);
    }
}
