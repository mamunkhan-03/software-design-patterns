package com.mamun.designpatterns.creational.abstractFactory;

public class PayPalReceipt implements Receipt{

    @Override
    public void generateReceipt() {
        System.out.println("PayPal Receipt Generated");
        System.out.println("Confirmation sent to PayPal email");
    }
}
