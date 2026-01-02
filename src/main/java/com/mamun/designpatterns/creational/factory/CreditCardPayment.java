package com.mamun.designpatterns.creational.factory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class CreditCardPayment implements Payment {

    private String cardNumber;
    private String cardCodeNo;
    private String expiry;
    private String cardholder;

    public CreditCardPayment(String cardNumber, String cardCodeNo, String expiry, String cardholder) {
        this.cardNumber = cardNumber;
        this.cardCodeNo = cardCodeNo;
        this.expiry = expiry;
        this.cardholder = cardholder;
    }

    @Override
    public boolean validate() {
        if (cardNumber.length() == 16 && cardCodeNo.length() ==4 ) {
            System.out.println("Credit card validated for " + cardholder);
            return true;
        }
        System.out.println("Invalid credit card details");
        return false;
    }

    @Override
    public Map<String, String> processPayment(double amount) {
        Map<String, String> result = new HashMap<>();

        if (validate()) {
            String transactionId = "CC-" + LocalDateTime.now().format(
                    DateTimeFormatter.ofPattern("yyyyMMddHHmmss")
            );
            System.out.println("Processing " + amount + "Tk via Credit Card.");
            System.out.println("Card ending in " + cardNumber.substring(12));

            result.put("status", "success");
            result.put("transaction_id", transactionId);
            result.put("amount", String.valueOf(amount));
            result.put("method", "Credit Card");
            result.put("timestamp", LocalDateTime.now().toString());
        } else {
            result.put("status", "failed");
            result.put("reason", "Invalid card details");
        }
        return result;
    }

    @Override
    public String getPaymentType() {
        return "Credit Card";
    }
}




