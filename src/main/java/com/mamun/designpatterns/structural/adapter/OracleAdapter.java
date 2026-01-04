package com.mamun.designpatterns.structural.adapter;

class OracleAdapter implements Database {
    private OracleDatabase oracleDB;

    public OracleAdapter() {
        this.oracleDB = new OracleDatabase();
    }

    @Override
    public void connect(String host, int port, String dbName) {
        oracleDB.createConnection(host, dbName, port);
    }

    @Override
    public void executeQuery(String query) {
        oracleDB.executeSQLCommand(query);
    }

    @Override
    public void disconnect() {
        oracleDB.closeSession();
    }
}