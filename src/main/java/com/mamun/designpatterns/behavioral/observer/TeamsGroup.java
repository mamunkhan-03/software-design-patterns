package com.mamun.designpatterns.behavioral.observer;

public interface TeamsGroup {

    void addMember(GroupMember member);
    void removeMember(GroupMember member);
    void notifyAllMembers(String senderName, String message);
}
