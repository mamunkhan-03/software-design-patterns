package com.mamun.designpatterns.creational.factory;

import java.util.HashMap;
import java.util.Map;

public class FactoryRun {

    public static void run (){

        System.out.println("---Credit Card Payment ---");
        Map<String, String> creditCardCredential = new HashMap<>();
        creditCardCredential.put("cardNumber", "1234567812345678");
        creditCardCredential.put("cardCodeNo", "1234");
        creditCardCredential.put("expiry", "12/25");
        creditCardCredential.put("cardholder", "Md. Mamun Hossain");

        Payment creditCardPayment = PaymentFactory.createPayment(PaymentType.CREDIT_CARD, creditCardCredential);

        Map<String, String> result1 = creditCardPayment.processPayment(150.00);
        System.out.println("Result: " + result1.get("status"));
        System.out.println("Transaction ID: " + result1.get("transaction_id"));
        System.out.println();

        // Example 2: Process PayPal Payment
        System.out.println("--- PayPal Payment ---");
        Map<String, String> payPalCredential= new HashMap<>();
        payPalCredential.put("email", "mamun@gmail.com");
        payPalCredential.put("password", "mamun@123");

        Payment paypalPayment = PaymentFactory.createPayment(PaymentType.PAYPAL, payPalCredential);
        Map<String, String> result2 = paypalPayment.processPayment(89.99);
        System.out.println("Result: " + result2.get("status"));
        System.out.println("Transaction ID: " + result2.get("transaction_id"));
        System.out.println();

        // Example 3: Process Cryptocurrency Payment
        System.out.println("---Cryptocurrency Payment ---");
        Map<String, String> cryptoCredential = new HashMap<>();
        cryptoCredential.put("walletAddress", "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
        cryptoCredential.put("cryptoType", "Bitcoin");

        Payment cryptoPayment = PaymentFactory.createPayment(PaymentType.CRYPTOCURRENCY, cryptoCredential);
        Map<String, String> result3 = cryptoPayment.processPayment(500.00);
        System.out.println("Result: " + result3.get("status"));
        System.out.println("Transaction ID: " + result3.get("transaction_id"));
        System.out.println();

    }

}
