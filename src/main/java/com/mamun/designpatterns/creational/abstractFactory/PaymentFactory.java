package com.mamun.designpatterns.creational.abstractFactory;

public interface PaymentFactory {

    Payment createPayment();
    Receipt createReceipt();
}
