package com.mamun.designpatterns.creational.abstractFactory;

public class CryptoFactory implements PaymentFactory{
    @Override
    public Payment createPayment() {
        return new CryptoPayment();
    }

    @Override
    public Receipt createReceipt() {
        return new CryptoReceipt();
    }
}
