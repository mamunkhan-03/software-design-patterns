package com.mamun.designpatterns.solid.srp;

public class SingleResponsibilityRun {

    public static void run() {

        AccountService accountService = new AccountService();
        LoanInterestService loanInterestService = new LoanInterestService();
        OtpService otpService = new OtpService();
        NotificationService notificationService = new NotificationService();

        System.out.println("---- Deposit Flow ----");
        accountService.deposit(5000, "ACC12345");
        otpService.sendOtp("sms");
        notificationService.sendNotification("email");

        System.out.println("\n---- Loan Info ----");
        double interest = loanInterestService.getInterestRate("HOMELOAN");
        System.out.println("Interest Rate: " + interest + "%");

        System.out.println(
                "Running SRP on thread: " + Thread.currentThread()
        );
    }
}
