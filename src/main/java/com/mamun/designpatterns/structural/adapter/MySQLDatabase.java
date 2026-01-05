package com.mamun.designpatterns.structural.adapter;

public class MySQLDatabase {

    public void openConnection(String server, String database, int portNumber) {
        System.out.println("MySQL: Connected to " + server + ":" + portNumber + "/" + database);
    }

    public void runSQL(String sqlQuery) {
        System.out.println("MySQL: Executing -> " + sqlQuery);
    }

    public void closeConnection() {
        System.out.println("MySQL: Connection closed");
    }
}
