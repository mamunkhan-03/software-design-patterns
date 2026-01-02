package com.mamun.designpatterns.creational.singleton;

public class SingletonRun {

    public static void run (){

        System.out.println("Getting Database Connection : ");
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.connect();
        db1.executeQuery("SELECT * FROM users");

        System.out.println("\nGetting Database Connection 2 : ");
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.executeQuery("SELECT * FROM products");

        System.out.println("\nGetting Database Connection3 : ");
        DatabaseConnection db3 = DatabaseConnection.getInstance();
        db3.executeQuery("SELECT * FROM products");

        System.out.println("\nVerification: Are they the same instance?");
        System.out.println("db1 == db2: " + (db1 == db2));
        System.out.println("db2 == db3: " + (db2 == db3));
        System.out.println("db1 == db3: " + (db1 == db3));

        db1.showConnectionInfo();
        db1.disconnect();

        System.out.println("\nTrying to execute query after disconnect");
        db2.executeQuery("SELECT * FROM customers");

        // Reconnect using any reference
        System.out.println("\nReconnecting using db3 : ");
        db3.connect();
        db3.executeQuery("UPDATE users SET status='active'");

        // Final info
        db1.showConnectionInfo();

    }
}
