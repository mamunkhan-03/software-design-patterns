package com.mamun.designpatterns.behavioral.command;

public class Television {

    private String location;
    private boolean isOn = false;
    private int volume = 10;

    public Television(String location) {
        this.location = location;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(location + "TV is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(location + "TV is OFF");
    }

    public void volumeUp() {
        volume++;
        System.out.println(location + " TV volume: " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println(location + " TV volume: " + volume);
    }
}
