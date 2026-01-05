package com.mamun.designpatterns.behavioral.mediator;

public class Employee extends User{

    public Employee(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " is typing...");
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message, String senderName) {
        System.out.println(this.name + " received from " + senderName + ": " + message);
    }
}
