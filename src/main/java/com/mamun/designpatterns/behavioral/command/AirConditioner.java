package com.mamun.designpatterns.behavioral.command;

public class AirConditioner {

    private String location;
    private boolean isOn = false;
    private int temperature = 24;

    public AirConditioner(String location) {
        this.location = location;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(location + " AC is ON at " + temperature + "°C");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(location + " AC is OFF");
    }

    public void setTemperature(int temp) {
        temperature = temp;
        System.out.println(location + " AC temperature set to " + temperature + "°C");
    }

    public int getTemperature() {
        return temperature;
    }
}
