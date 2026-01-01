package com.mamun.designpatterns.solid.lsp;

public class LiskovSubstituitionRun {

    public static void run (){
        BankAccount savings = new SavingsAccount();
        BankAccount fda = new FixedDepositAccount();

        savings.deposit(1000);
        ((SavingsAccount) savings).withdraw(500);


        fda.deposit(5000);

    }
}
