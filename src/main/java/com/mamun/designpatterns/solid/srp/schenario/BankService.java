package com.mamun.designpatterns.solid.srp.schenario;

public class BankService {

    public void deposit() {
        System.out.println("Deposit money");
    }

    public void withdraw() {
        System.out.println("Withdraw money");
    }

    public void loanInterestInfo(String loanType) {

        if ("PERSONAL".equals(loanType)) {
            System.out.println("Personal loan interest");
        }

        if ("HOME".equals(loanType)) {
            System.out.println("Home loan interest");
        }
    }

    public void sendOtp(String medium) {

        if ("SMS".equals(medium)) {
            System.out.println("Send OTP via SMS");
        }

        if ("EMAIL".equals(medium)) {
            System.out.println("Send OTP via Email");
        }
    }

    public void sendNotification(String medium) {

        if ("SMS".equals(medium)) {
            System.out.println("Send notification via SMS");
        }

        if ("EMAIL".equals(medium)) {
            System.out.println("Send notification via Email");
        }
    }
}
