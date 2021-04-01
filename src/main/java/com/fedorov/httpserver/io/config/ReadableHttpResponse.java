package com.fedorov.httpserver.io.config;

import com.fedorov.httpserver.io.HttpResponse;

import java.util.Map;

public interface ReadableHttpResponse extends HttpResponse {

    int getStatus();
    Map<String, String> getHeaders();
    byte[] getBody();
    boolean isBodyEmpty();
    int getBodyLength();



}
