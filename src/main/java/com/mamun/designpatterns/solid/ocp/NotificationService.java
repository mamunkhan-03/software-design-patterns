package com.mamun.designpatterns.solid.ocp;

public class NotificationService {

    public void notify (NotificationSender sender, String message) {
        sender.sendNotification(message);
    }
}
