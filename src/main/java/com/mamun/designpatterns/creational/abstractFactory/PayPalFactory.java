package com.mamun.designpatterns.creational.abstractFactory;

public class PayPalFactory implements PaymentFactory{
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }

    @Override
    public Receipt createReceipt() {
        return new PayPalReceipt();
    }
}
