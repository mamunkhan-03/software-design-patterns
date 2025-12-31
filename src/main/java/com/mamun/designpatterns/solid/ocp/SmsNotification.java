package com.mamun.designpatterns.solid.ocp;

public class SmsNotification implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Notification to sms : "+ message );
    }
}
