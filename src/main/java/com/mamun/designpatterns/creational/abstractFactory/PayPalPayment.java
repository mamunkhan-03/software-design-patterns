package com.mamun.designpatterns.creational.abstractFactory;

public class PayPalPayment implements Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing " + amount + " Tk via PayPal");
        System.out.println("PayPal account debited");
    }
}
