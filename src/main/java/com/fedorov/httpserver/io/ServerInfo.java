package com.fedorov.httpserver.io;

import lombok.Data;

@Data
public class ServerInfo {

    private String name;
    private int port;
    private int threadCount;

}
