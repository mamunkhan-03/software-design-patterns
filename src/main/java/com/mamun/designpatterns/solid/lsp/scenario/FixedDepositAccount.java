package com.mamun.designpatterns.solid.lsp.scenario;

public class FixedDepositAccount extends BankAccount {

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Cannot withdraw from Fixed Deposit!");
    }
}
