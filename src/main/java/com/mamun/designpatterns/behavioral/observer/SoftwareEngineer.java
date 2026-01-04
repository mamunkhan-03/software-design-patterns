package com.mamun.designpatterns.behavioral.observer;

public class SoftwareEngineer  implements GroupMember{

    private String name;

    public SoftwareEngineer(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String senderName, String message, String timestamp) {
        System.out.println("Teams Notification: New message from " + senderName);
        System.out.println("Time: " + timestamp);
        System.out.println("Message: \"" + message + "\"");

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "Software Engineer";
    }
}
