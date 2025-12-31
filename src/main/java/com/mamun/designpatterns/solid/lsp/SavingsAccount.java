package com.mamun.designpatterns.solid.lsp;

public class SavingsAccount extends BankAccount{
    @Override
    void deposit(double amount) {
        System.out.println("Depositing " + amount + " into Savings Account");
    }

    void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + " from Savings Account");
    }
}
