package com.mamun.designpatterns.structural.adapter;

class PostgreSQLAdapter implements Database {
    private PostgreSQLDatabase postgresDB;

    public PostgreSQLAdapter() {
        this.postgresDB = new PostgreSQLDatabase();
    }

    @Override
    public void connect(String host, int port, String dbName) {
        postgresDB.initConnection(host, dbName, port);
    }

    @Override
    public void executeQuery(String query) {
        postgresDB.performQuery(query);
    }

    @Override
    public void disconnect() {
        postgresDB.shutdownConnection();
    }
}
