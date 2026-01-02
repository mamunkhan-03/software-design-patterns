package com.mamun.designpatterns.creational.factory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class CryptoCurrencyPayment implements Payment{

    private String walletAddress;
    private String cryptoType;

    public CryptoCurrencyPayment(String walletAddress, String cryptoType) {
        this.walletAddress = walletAddress;
        this.cryptoType = cryptoType;
    }

    @Override
    public boolean validate() {
        if (walletAddress.length() >= 26 && walletAddress.length() <= 35) {
            System.out.println("Cryptocurrency wallet validated");
            return true;
        }
        System.out.println("Invalid wallet address");
        return false;
    }

    @Override
    public Map<String, String> processPayment(double amount) {
        Map<String, String> result = new HashMap<>();

        if (validate()) {
            String transactionId = "CRYPTO-" + LocalDateTime.now().format(
                    DateTimeFormatter.ofPattern("yyyyMMddHHmmss")
            );
            System.out.println("Processing " + String.format("%.2f", amount) + " via " + cryptoType);
            System.out.println("Wallet: " + walletAddress.substring(0, 10));

            result.put("status", "success");
            result.put("transaction_id", transactionId);
            result.put("amount", String.valueOf(amount));
            result.put("method", cryptoType);
            result.put("timestamp", LocalDateTime.now().toString());
        } else {
            result.put("status", "failed");
            result.put("reason", "Invalid wallet address");
        }
        return result;
    }

    @Override
    public String getPaymentType() {
        return "Cryptocurrency (" + cryptoType + ")";
    }
}
