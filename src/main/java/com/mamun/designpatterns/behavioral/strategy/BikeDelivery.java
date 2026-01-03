package com.mamun.designpatterns.behavioral.strategy;

public class BikeDelivery implements DeliveryStrategy{

    @Override
    public void deliver(String packageId, String destination) {
        System.out.println("\nDelivery by bike: ");
        System.out.println("Package ID: " + packageId);
        System.out.println("Destination: " + destination);
    }

    @Override
    public double calculateCost(double distance, double weight) {
        // Bike: 20 Tk base + 5 Tk per km + 2 Tk per kg
        double cost = 20 + (distance * 5) + (weight * 2);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Cost: Tk " + String.format("%.2f", cost));
        return cost;
    }

    @Override
    public String getEstimatedTime(double distance) {
        // Bike: 30 km/hour average speed
        double hours = distance / 30;
        int minutes = (int)(hours * 60);
        String time = minutes + " minutes";
        System.out.println("Estimated Time: " + time);
        return time;
    }
}
