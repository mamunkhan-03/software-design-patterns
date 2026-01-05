package com.mamun.designpatterns.behavioral.strategy;

public class DeliveryService {

    private DeliveryStrategy deliveryStrategy;

    public DeliveryService(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }
    public void processDelivery(String packageId, String destination, double distance, double weight) {
        if (deliveryStrategy == null) {
            System.out.println("Please select a delivery method!");
            return;
        }
        System.out.println("Processing Delivery Request");

        deliveryStrategy.deliver(packageId, destination);
        deliveryStrategy.calculateCost(distance, weight);
        deliveryStrategy.getEstimatedTime(distance);

    }

    public void setDeliveryService(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }
}
