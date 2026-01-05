package com.mamun.designpatterns.behavioral.strategy;

public interface DeliveryStrategy {

    void deliver(String packageId, String destination);
    double calculateCost(double distance, double weight);
    String getEstimatedTime(double distance);

}
