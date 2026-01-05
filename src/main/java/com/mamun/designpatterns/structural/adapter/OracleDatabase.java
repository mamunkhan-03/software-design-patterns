package com.mamun.designpatterns.structural.adapter;

public class OracleDatabase {

    public void createConnection(String serverName, String databaseName, int portNum) {
        System.out.println("Oracle: Connected to " + serverName + ":" + portNum + "/" + databaseName);
    }

    public void executeSQLCommand(String sql) {
        System.out.println("Oracle: Executing -> " + sql);
    }

    public void closeSession() {
        System.out.println("Oracle: Session closed");
    }
}
