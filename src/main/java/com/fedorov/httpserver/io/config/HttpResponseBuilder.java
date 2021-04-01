package com.fedorov.httpserver.io.config;

public interface HttpResponseBuilder {

    ReadableHttpResponse buildNewHttpResponse();

    void prepareHttpResponse(ReadableHttpResponse response, boolean cleanBody);


}
