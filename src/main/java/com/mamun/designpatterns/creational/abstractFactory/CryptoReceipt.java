package com.mamun.designpatterns.creational.abstractFactory;

public class CryptoReceipt implements Receipt{

    @Override
    public void generateReceipt() {
        System.out.println("Crypto Receipt Generated");
        System.out.println("Transaction hash: 0x7a8f9b2c...");
    }
}
