package com.mamun.designpatterns.behavioral.observer;

class HRManager implements GroupMember {
    private String name;

    public HRManager(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String senderName, String message, String timestamp) {

        System.out.println("Teams Notification: " + senderName + " sent a message");
        System.out.println("Time: " + timestamp);
        System.out.println("Message: \"" + message + "\"");

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "HR Manager";
    }
}
