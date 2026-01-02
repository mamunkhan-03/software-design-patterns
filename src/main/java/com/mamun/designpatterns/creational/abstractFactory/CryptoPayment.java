package com.mamun.designpatterns.creational.abstractFactory;

public class CryptoPayment implements Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing " + amount + " Tk via Cryptocurrency");
        System.out.println("Transaction broadcasted to blockchain");
    }
}
