package com.mamun.designpatterns.behavioral.strategy;

public class DroneDelivery implements DeliveryStrategy{

    @Override
    public void deliver(String packageId, String destination) {
        System.out.println("\nDelivery by drone: ");
        System.out.println("Package ID: " + packageId);
        System.out.println("Destination: " + destination);
    }

    @Override
    public double calculateCost(double distance, double weight) {
        // Drone: 50 Tk base + 15 Tk per km + 10 Tk per kg
        double cost = 50 + (distance * 15) + (weight * 10);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Cost: Tk " + String.format("%.2f", cost));
        return cost;
    }

    @Override
    public String getEstimatedTime(double distance) {
        // Drone: 60 km/hour average speed (fastest)
        double hours = distance / 60;
        int minutes = (int)(hours * 60);
        String time = minutes + " minutes";
        System.out.println("Estimated Time: " + time);
        return time;
    }
}
