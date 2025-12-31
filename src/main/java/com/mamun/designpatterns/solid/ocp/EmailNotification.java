package com.mamun.designpatterns.solid.ocp;

public class EmailNotification implements NotificationSender{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Notification to email : "+ message );
    }
}
