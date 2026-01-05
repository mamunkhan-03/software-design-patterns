package com.mamun.designpatterns.behavioral.strategy;

public class StrategyRun {

    public static void run (){

        DeliveryService service=new DeliveryService(new BikeDelivery());
        service.processDelivery("001", "Dhanmondi, Dhaka", 5, 1);

        service.setDeliveryService(new TruckDelivery());
        service.processDelivery("002", "Chittagong", 250, 50);

        service.setDeliveryService(new DroneDelivery());
        service.processDelivery("003", "Maniknagar, Dhaka", 8, 1);
    }
}
