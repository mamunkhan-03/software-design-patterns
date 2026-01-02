package com.mamun.designpatterns.creational.singleton;

public class DatabaseConnection {


    private static DatabaseConnection instance;

    private String connectionUrl;
    private String username;
    private boolean isConnected;

    private DatabaseConnection() {
        this.connectionUrl = "jdbc:mysql://localhost:3306/mydb";
        this.username = "admin";
        this.isConnected = false;
        System.out.println("DatabaseConnection instance created!");
    }

    //Public static method to get the single instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Connected to database ");
        } else {
            System.out.println("Already connected to database");
        }
    }

    public void disconnect() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Disconnected from database");
        } else {
            System.out.println("Already disconnected");
        }
    }

    public void executeQuery(String query) {
        if (isConnected) {
            System.out.println("Executing query: " + query);
            System.out.println("Result: Query executed successfully!");
        } else {
            System.out.println("Cannot execute query. Database not connected!");
        }
    }

    public void showConnectionInfo() {
        System.out.println("--- Database Connection Info ---");
        System.out.println("URL: " + connectionUrl);
        System.out.println("User: " + username);
        System.out.println("Status: " + (isConnected ? "Connected" : "Disconnected"));
        System.out.println("\n");
    }
}
