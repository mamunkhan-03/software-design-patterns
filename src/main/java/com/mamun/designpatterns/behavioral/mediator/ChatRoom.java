package com.mamun.designpatterns.behavioral.mediator;

public class ChatRoom implements ChatMediator{

    private java.util.List<User> users = new java.util.ArrayList<>();

    ChatRoom (){

    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
        System.out.println(user.getName() + " joined the chat room");
    }

    @Override
    public void sendMessage(String message, User sender) {
        System.out.println("\n" + sender.getName() + " sends: " + message);

        // Send message to all users except sender
        for (User user : users) {
            if (user != sender) {
                user.receive(message, sender.getName());
            }
        }
    }
}
