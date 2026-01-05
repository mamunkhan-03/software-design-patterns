package com.mamun.designpatterns.behavioral.observer;

class QAEngineer implements GroupMember {
    private String name;

    public QAEngineer(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String senderName, String message, String timestamp) {
        System.out.println("🔔 [" + name + " - QA Engineer]");
        System.out.println("   New message in ERA ALL Employee group");
        System.out.println("   From: " + senderName + " at " + timestamp);
        System.out.println("   Message: \"" + message + "\"");
        System.out.println("   Status: Read");
        System.out.println();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "QA Engineer";
    }
}