package com.mamun.designpatterns.creational.abstractFactory;

public class CreditCardFactory implements PaymentFactory{

    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }

    @Override
    public Receipt createReceipt() {
        return new CreditCardReceipt();
    }
}
