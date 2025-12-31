package com.mamun.designpatterns.solid.ocp;

public class WhatsAppNotification implements NotificationSender{
    @Override
    public void sendNotification(String message) {

        System.out.println("Sending Notification to WhatsApp : "+ message );
    }
}
