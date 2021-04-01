package com.fedorov.httpserver.io.config;

import com.fedorov.httpserver.io.HttpRequest;
import com.fedorov.httpserver.io.exception.HttpServerException;

import java.io.IOException;
import java.io.InputStream;

public interface HttpRequestParser {

    HttpRequest parseHttpRequest(InputStream inputStream, String remoteAddress) throws IOException, HttpServerException;
}
