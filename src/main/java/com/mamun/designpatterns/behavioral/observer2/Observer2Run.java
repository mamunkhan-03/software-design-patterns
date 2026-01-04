package com.mamun.designpatterns.behavioral.observer2;

public class Observer2Run {

    public static void run (){


        WeatherStation station = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay("Phone Display");
        Observer tvDisplay = new TVDisplay("TV Display");
        Observer desktopDisplay = new DesktopDisplay("Desktop Display");

        station.addObserver(phoneDisplay);
        station.addObserver(tvDisplay);
        station.addObserver(desktopDisplay);

        System.out.println("\nMorning Weather : ");
        station.setWeatherData(28.5f, 65.0f, "Sunny");

        System.out.println("\nAfternoon Weather : ");
        station.setWeatherData(32.0f, 70.0f, "Hot");

        System.out.println("\nEvening Weather : ");
        station.setWeatherData(26.5f, 75.0f, "Cloudy");

        System.out.println();
        station.removeObserver(tvDisplay);

        System.out.println("\nNight Weather : ");
        station.setWeatherData(24.0f, 80.0f, "Rainy");
    }

}
