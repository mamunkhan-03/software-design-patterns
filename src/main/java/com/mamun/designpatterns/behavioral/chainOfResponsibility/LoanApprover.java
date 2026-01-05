package com.mamun.designpatterns.behavioral.chainOfResponsibility;

public interface LoanApprover {

    void setNextApprover(LoanApprover nextApprover);
    void processLoan(LoanApplication application);
}
