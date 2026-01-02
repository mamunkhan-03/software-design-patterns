package com.mamun.designpatterns.creational.factory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class PayPalPayment implements Payment {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean validate() {
        if (email.contains("@") && password.length() >= 6) {
            System.out.println("PayPal account validated: " + email);
            return true;
        }
        System.out.println("Invalid PayPal credentials");
        return false;
    }

    @Override
    public Map<String, String> processPayment(double amount) {
        Map<String, String> result = new HashMap<>();

        if (validate()) {
            String transactionId = "PP-" + LocalDateTime.now().format(
                    DateTimeFormatter.ofPattern("yyyyMMddHHmmss")
            );
            System.out.println("Processing " + String.format("%.2f", amount) + " via PayPal.");
            System.out.println("PayPal account: " + email);

            result.put("status", "success");
            result.put("transaction_id", transactionId);
            result.put("amount", String.valueOf(amount));
            result.put("method", "PayPal");
            result.put("timestamp", LocalDateTime.now().toString());
        } else {
            result.put("status", "failed");
            result.put("reason", "Invalid PayPal credentials");
        }
        return result;
    }

    @Override
    public String getPaymentType() {
        return "PayPal";
    }
}
