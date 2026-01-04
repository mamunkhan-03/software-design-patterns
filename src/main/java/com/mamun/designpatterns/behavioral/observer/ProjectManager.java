package com.mamun.designpatterns.behavioral.observer;

class ProjectManager implements GroupMember {
    private String name;

    public ProjectManager(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String senderName, String message, String timestamp) {
        System.out.println("   Teams Notification from: " + senderName);
        System.out.println("   Received at: " + timestamp);
        System.out.println("   Content: \"" + message + "\"");

        if (message.contains("meeting") || message.contains("deadline")) {
            System.out.println(" Action: Added to project timeline");
        }
        System.out.println();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "Project Manager";
    }
}

