package com.mamun.designpatterns.creational.abstractFactory;

public class CreditCardReceipt implements Receipt{

    @Override
    public void generateReceipt() {
        System.out.println("Credit Card Receipt Generated");
        System.out.println("Receipt sent to email");
    }
}
