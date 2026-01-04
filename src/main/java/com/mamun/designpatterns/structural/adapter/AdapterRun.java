package com.mamun.designpatterns.structural.adapter;

public class AdapterRun {

    public static void fetchUserData(Database db) {
        System.out.println();
        db.connect("localhost", 8080, "stlbas");
        db.executeQuery("SELECT * FROM users WHERE stfetran'");
        db.disconnect();
        System.out.println();
    }

    public static void  run(){

        System.out.println("MySQL:");
        Database devDatabase = new MySQLAdapter();
        fetchUserData(devDatabase);

        System.out.println("Oracle:");
        Database testDatabase = new OracleAdapter();
        fetchUserData(testDatabase);

        System.out.println("PostgreSQL:");
        Database prodDatabase = new PostgreSQLAdapter();
        fetchUserData(prodDatabase);

    }
}
