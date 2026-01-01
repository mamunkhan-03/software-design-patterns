package com.mamun.designpatterns.solid.ocp.scenario;

public class NotificationService {

    public void sendNotification(String mediumType) {

        if ("email".equalsIgnoreCase(mediumType)) {
            System.out.println("Sending notification via Email");
        }

        if ("sms".equalsIgnoreCase(mediumType)) {
            System.out.println("Sending notification via SMS");
        }
    }
}
