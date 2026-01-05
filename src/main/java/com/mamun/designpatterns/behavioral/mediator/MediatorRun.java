package com.mamun.designpatterns.behavioral.mediator;

public class MediatorRun {

    public static void run (){

        ChatMediator chatRoom = new ChatRoom();

        // Create users
        User mamun = new Employee(chatRoom, "Mamun");
        User anisur = new Employee(chatRoom, "Anisur");
        User tipu = new Employee(chatRoom, "Tipu");
        User rashid = new Employee(chatRoom, "Rashid");

        // Add users to chat room
        chatRoom.addUser(mamun);
        chatRoom.addUser(anisur);
        chatRoom.addUser(tipu);
        chatRoom.addUser(rashid);

        System.out.println("\nConversation Starts: ");

        // Users send messages through mediator
        mamun.send("Hello everyone! Good morning!");

        anisur.send("Good morning Mamun!");

        tipu.send("Hey team, meeting at 3 PM today");

        rashid.send("Sounds good, I'll be there!");

    }

}
