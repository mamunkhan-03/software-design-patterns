package com.mamun.designpatterns.solid.lsp;

public class FixedDepositAccount extends BankAccount{
    @Override
    void deposit(double amount) {
        System.out.println("Depositing " + amount + " into Fixed Deposit Account");
    }
}
