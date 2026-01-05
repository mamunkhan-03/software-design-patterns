package com.mamun.designpatterns.behavioral.observer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ERAAllEmployeeGroup implements TeamsGroup{

    private String groupName;
    private List<GroupMember> members;

    public ERAAllEmployeeGroup() {
        this.groupName = "ERA ALL Employee";
        this.members = new ArrayList<>();
    }

    @Override
    public void addMember(GroupMember member) {
        members.add(member);
        System.out.println(member.getName() + " (" + member.getRole() + ") added to group");
        System.out.println("   Total members: " + members.size());
    }

    @Override
    public void removeMember(GroupMember member) {
        members.remove(member);
        System.out.println(member.getName() + " removed from group (Left company)");
        System.out.println("   Total members: " + members.size());
    }

    @Override
    public void notifyAllMembers(String senderName, String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));

        System.out.println("\n Message to all " + members.size() + " members.\n");

        // Notify all members except sender
        for (GroupMember member : members) {
            if (!member.getName().equals(senderName)) {
                member.receiveNotification(senderName, message, timestamp);
            }
        }
    }

    // When someone sends message in group
    public void sendMessage(GroupMember sender, String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println("NEW MESSAGE IN: " + groupName);
        System.out.println("From: " + sender.getName() + " (" + sender.getRole() + ")");
        System.out.println("Time: " + timestamp);
        System.out.println("Message: \"" + message + "\"");

        notifyAllMembers(sender.getName(), message);
    }
}
