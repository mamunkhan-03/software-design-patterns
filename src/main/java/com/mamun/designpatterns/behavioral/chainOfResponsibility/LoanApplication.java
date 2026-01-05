package com.mamun.designpatterns.behavioral.chainOfResponsibility;

public class LoanApplication {

    private String applicantName;
    private double loanAmount;
    private String purpose;

    public LoanApplication(String applicantName, double loanAmount, String purpose) {
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
        this.purpose = purpose;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void displayApplication() {
        System.out.println("\n Loan Application:");
        System.out.println("   Applicant: " + applicantName);
        System.out.println("   Amount: Tk " + String.format("%,.2f", loanAmount));
        System.out.println("   Purpose: " + purpose);

    }
}

