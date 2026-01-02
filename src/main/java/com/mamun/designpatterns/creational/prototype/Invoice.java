package com.mamun.designpatterns.creational.prototype;

public class Invoice implements DocumentPrototype {

    private String companyName;
    private String invoiceNumber;
    private double amount;
    private String template;

    public Invoice(String companyName, String invoiceNumber, double amount, String template) {
        this.companyName = companyName;
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
        this.template = template;

        System.out.println("Creating new Invoice (expensive operation).");
        simulateExpensiveOperation();
    }

    // Private no-arg constructor for cloning
    private Invoice() {
        // Empty - used only for cloning
    }

    @Override
    public DocumentPrototype clone() {
        System.out.println("Cloning Invoice (fast operation)...");
        Invoice cloned = new Invoice();
        cloned.companyName = this.companyName;
        cloned.invoiceNumber = this.invoiceNumber;
        cloned.amount = this.amount;
        cloned.template = this.template;
        return cloned;
    }

    @Override
    public void showDetails() {
        System.out.println("   INVOICE");
        System.out.println("   Company: " + companyName);
        System.out.println("   Invoice #: " + invoiceNumber);
        System.out.println("   Amount: " + amount);
        System.out.println("   Template: " + template);
    }

    private void simulateExpensiveOperation() {
        try {
            Thread.sleep(1000); // Simulate loading template, database connection, etc.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
