package com.mamun.designpatterns.behavioral.command;

public class ACTemperatureCommand implements Command{

    private AirConditioner ac;
    private int newTemperature;
    private int previousTemperature;

    public ACTemperatureCommand(AirConditioner ac, int temperature) {
        this.ac = ac;
        this.newTemperature = temperature;
    }

    @Override
    public void execute() {
        previousTemperature = ac.getTemperature();
        ac.setTemperature(newTemperature);
    }

    @Override
    public void undo() {
        ac.setTemperature(previousTemperature);
    }
}
