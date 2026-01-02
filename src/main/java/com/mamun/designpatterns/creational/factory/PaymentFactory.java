package com.mamun.designpatterns.creational.factory;

import java.util.Map;

enum PaymentType {
    CREDIT_CARD,
    PAYPAL,
    CRYPTOCURRENCY
}
public class PaymentFactory {

    public static Payment createPayment(PaymentType type, Map<String, String> credentials) {
        switch (type) {
            case CREDIT_CARD:
                return new CreditCardPayment(
                        credentials.get("cardNumber"),
                        credentials.get("cardCodeNo"),
                        credentials.get("expiry"),
                        credentials.get("cardholder")
                );

            case PAYPAL:
                return new PayPalPayment(
                        credentials.get("email"),
                        credentials.get("password")
                );

            case CRYPTOCURRENCY:
                return new CryptoCurrencyPayment(
                        credentials.get("walletAddress"),
                        credentials.get("cryptoType")
                );

            default:
                throw new IllegalArgumentException("Unknown payment type: " + type);
        }
    }

}
