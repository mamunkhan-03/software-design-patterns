package com.mamun.designpatterns.behavioral.chainOfResponsibility;

public class CreditCommittee implements LoanApprover{

    private LoanApprover nextApprover;
    private static final double MAX_BANK_LIMIT = 100000000; //10 crore

    @Override
    public void setNextApprover(LoanApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void processLoan(LoanApplication application) {
        if (application.getLoanAmount() <= MAX_BANK_LIMIT) {
            System.out.println("\n CREDIT COMMITTEE Approved!");
            System.out.println("   Authority: Executive Credit Committee");
            System.out.println("   Decision: APPROVED ");
        } else {
            System.out.println("\n CREDIT COMMITTEE Rejected!");
            System.out.println("   Reason: Amount exceeds bank's lending capacity");
            System.out.println("   Maximum Limit: Tk " + String.format("%,.2f", MAX_BANK_LIMIT));
            System.out.println("   Decision: REJECTED ");
        }

    }
}
