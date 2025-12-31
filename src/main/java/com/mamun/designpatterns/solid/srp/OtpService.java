package com.mamun.designpatterns.solid.srp;

public class OtpService {

    public void sendOtp(String mediumType) {

        if ("email".equalsIgnoreCase(mediumType)) {
            System.out.println("Sending OTP via Email");
        }

        if ("sms".equalsIgnoreCase(mediumType)) {
            System.out.println("Sending OTP via SMS");
        }
    }
}
