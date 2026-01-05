package com.mamun.designpatterns.structural.adapter;

public class PostgreSQLDatabase {

    public void initConnection(String host, String db, int port) {
        System.out.println("PostgreSQL: Connected to " + host + ":" + port + "/" + db);
    }

    public void performQuery(String query) {
        System.out.println("PostgreSQL: Executing -> " + query);
    }

    public void shutdownConnection() {
        System.out.println("PostgreSQL: Connection closed");
    }
}
