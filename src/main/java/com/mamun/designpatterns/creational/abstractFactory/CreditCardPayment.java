package com.mamun.designpatterns.creational.abstractFactory;

public class CreditCardPayment implements Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing " + amount + " Tk via Credit Card");
        System.out.println("Card charged successfully");
    }
}
