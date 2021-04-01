package com.fedorov.httpserver.io.config;

import com.fedorov.httpserver.io.HttpServerContext;
import com.fedorov.httpserver.io.ServerInfo;

import java.net.Socket;
import java.util.concurrent.ThreadFactory;

public interface HttpServerConfig {

    ServerInfo getServerInfo();
    String getStatusMessage(int statusCode);
    HttpRequestParser getHttpRequestParser();
    HttpResponseBuilder getHttpResponseBuilder();
    HttpResponseWriter getHttpResponseWriter();
    HttpServerContext getHttpServerContext();
    HttpRequestDispatcher getHttpRequestDispatcher();
    ThreadFactory getWorkerThreadFactory();
    HttpClientSocketHandler buildNewHttpClientSocketHandler(Socket clientSocekt);



}


























