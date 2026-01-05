package com.mamun.designpatterns.behavioral.command;

public class TVOnCommand implements Command{

    private Television tv;

    public TVOnCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }

    @Override
    public void undo() {
        tv.turnOff();
    }
}
