package com.fedorov.httpserver.io;

import javax.sql.DataSource;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;

public interface HttpServerContext {

    ServerInfo getServerInfo();
    Collection<String> getSupportedRequestMethods();

    Properties getSupportedResponceStatuses();

    DataSource getDatasource();

    Path getRootPath();

    String getContentType(String extension);

    HtmlTemplateManager getHtmlTemplateManager();

    Integer getExpiresDaysForResource(String extension);



}
