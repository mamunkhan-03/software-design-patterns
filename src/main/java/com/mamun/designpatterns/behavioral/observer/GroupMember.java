package com.mamun.designpatterns.behavioral.observer;

public interface GroupMember {

    void receiveNotification(String senderName, String message, String timestamp);
    String getName();
    String getRole();
}
