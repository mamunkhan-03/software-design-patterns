package com.mamun.designpatterns.behavioral.observer2;

public class PhoneDisplay implements Observer{
    private String displayName;
    private float temperature;
    private float humidity;
    private String condition;

    public PhoneDisplay(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public void update(float temperature, float humidity, String condition) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
        display();
    }

    private void display() {
        System.out.println(displayName + ": " + condition + ", " +
                temperature + "°C, Humidity: " + humidity + "%");
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }
}
