package com.mamun.designpatterns.creational.factory;

import java.math.BigDecimal;
import java.util.Map;

public interface Payment {

    boolean validate();

    Map<String, String> processPayment(double amount);

    String getPaymentType();
}
