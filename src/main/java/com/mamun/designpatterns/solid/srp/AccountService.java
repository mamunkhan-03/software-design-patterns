package com.mamun.designpatterns.solid.srp;

public class AccountService {

    public long deposit(long amount, String accountNumber) {
        System.out.println("Depositing " + amount + " to account " + accountNumber);
        return amount;
    }

    public long withdraw(long amount, String accountNumber) {
        System.out.println("Withdrawing " + amount + " from account " + accountNumber);
        return amount;
    }
}
