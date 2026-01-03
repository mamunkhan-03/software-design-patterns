package com.mamun.designpatterns.behavioral.chainOfResponsibility;

public class BranchManager implements LoanApprover {

    private LoanApprover nextApprover;
    private static final double APPROVAL_LIMIT = 50000;

    @Override
    public void setNextApprover(LoanApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void processLoan(LoanApplication application) {
        if (application.getLoanAmount() <= APPROVAL_LIMIT) {
            System.out.println("\n Branch Manager Approved!");
            System.out.println("   Authority: Branch Manager");
            System.out.println("   Approval Limit: Up to Tk " + String.format("%,.2f", APPROVAL_LIMIT));
            System.out.println("   Decision: APPROVED ");
        } else {
            System.out.println("\n Branch Manager Forwarding to Regional Manager...");
            System.out.println("   Reason: Amount exceeds approval limit (Tk" + String.format("%,.2f", APPROVAL_LIMIT) + ")");
            if (nextApprover != null) {
                nextApprover.processLoan(application);
            }
        }
    }
}
