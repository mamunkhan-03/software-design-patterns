package com.mamun.designpatterns.structural.adapter;

public interface Database {

    void connect(String host, int port, String dbName);
    void executeQuery(String query);
    void disconnect();
}
