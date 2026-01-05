package com.mamun.designpatterns.structural.adapter;

public class MySQLAdapter implements Database {

    private MySQLDatabase mysqlDB;

    public MySQLAdapter() {
        this.mysqlDB = new MySQLDatabase();
    }

    @Override
    public void connect(String host, int port, String dbName) {
        mysqlDB.openConnection(host, dbName, port);
    }

    @Override
    public void executeQuery(String query) {
        mysqlDB.runSQL(query);
    }

    @Override
    public void disconnect() {
        mysqlDB.closeConnection();
    }
}
