package com.mamun.designpatterns.behavioral.strategy;

public class TruckDelivery implements DeliveryStrategy{

    public void deliver(String packageId, String destination) {
        System.out.println("\nDelivery by truck: ");
        System.out.println("Package ID: " + packageId);
        System.out.println("Destination: " + destination);
    }

    @Override
    public double calculateCost(double distance, double weight) {
        // Truck: 100 Tk base + 10 Tk per km + 5 Tk per kg
        double cost = 100 + (distance * 10) + (weight * 5);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Cost: Tk " + String.format("%.2f", cost));
        return cost;
    }

    @Override
    public String getEstimatedTime(double distance) {
        // Truck: 50 km/hour average speed
        double hours = distance / 50;
        String time = String.format("%.1f", hours) + " hours";
        System.out.println("Estimated Time: " + time);
        return time;
    }
}
