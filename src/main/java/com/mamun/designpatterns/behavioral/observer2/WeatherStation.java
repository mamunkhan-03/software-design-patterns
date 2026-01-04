package com.mamun.designpatterns.behavioral.observer2;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private String condition;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println(observer.getDisplayName() + " registered to weather station");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println(observer.getDisplayName() + " removed from weather station");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, condition);
        }
    }

    public void setWeatherData(float temperature, float humidity, String condition) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
        System.out.println("\nWeather Station: New measurements recorded");
        notifyObservers();
    }
}
