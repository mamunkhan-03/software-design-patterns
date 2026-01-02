package com.mamun.designpatterns.creational.abstractFactory;

public class AbstractFactoryRun {

    public static void run (){

        System.out.println("--- Credit Card Payment ---");

        PaymentFactory factory=new CreditCardFactory();
        Payment payment =factory.createPayment();
        Receipt receipt=factory.createReceipt();

        payment.processPayment(100000.00);
        receipt.generateReceipt();

        System.out.println("\n--- Paypal Payment ---");

        PaymentFactory factory2=new PayPalFactory();
        payment =factory2.createPayment();
        receipt  =factory2.createReceipt();

        payment.processPayment(100000.00);
        receipt.generateReceipt();

        System.out.println("--- Crypto Payment ---");

        factory= new CreditCardFactory();
        payment =factory.createPayment();
        receipt=factory.createReceipt();

        payment.processPayment(100000.00);
        receipt.generateReceipt();

    }
}
