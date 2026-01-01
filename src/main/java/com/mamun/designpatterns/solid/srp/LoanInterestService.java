package com.mamun.designpatterns.solid.srp;

public class LoanInterestService {

    public double getInterestRate(String loanType) {

        if ("PERSONAL".equalsIgnoreCase(loanType)) {
            return 12.5;
        }

        if ("HOMELOAN".equalsIgnoreCase(loanType)) {
            return 8.0;
        }

        if ("CAR".equalsIgnoreCase(loanType)) {
            return 9.5;
        }

        throw new IllegalArgumentException("Invalid loan type");
    }
}
