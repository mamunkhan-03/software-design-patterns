package com.mamun.designpatterns.solid.lsp.schenario;

public class FixedDepositAccount extends BankAccount {

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Cannot withdraw from Fixed Deposit!");
    }
}
