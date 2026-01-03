package com.mamun.designpatterns.behavioral.command;

public class ACOffCommand implements Command{

    private AirConditioner ac;

    ACOffCommand (AirConditioner ac){
        this.ac=ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }

    @Override
    public void undo() {
        ac.turnOn();
    }
}
