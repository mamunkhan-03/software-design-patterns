package com.mamun.designpatterns.behavioral.command;

public class TVOffCommand implements Command{

    private Television tv;

    public TVOffCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }

    @Override
    public void undo() {
        tv.turnOn();
    }
}
