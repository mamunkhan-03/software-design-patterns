package com.mamun.designpatterns.creational.prototype;

public class Contract implements DocumentPrototype{

    private String partyA;
    private String partyB;
    private String terms;
    private String legalTemplate;

    public Contract(String partyA, String partyB, String terms, String legalTemplate) {
        this.partyA = partyA;
        this.partyB = partyB;
        this.terms = terms;
        this.legalTemplate = legalTemplate;

        System.out.println("Creating new Contract (expensive operation).");
        simulateExpensiveOperation();
    }

    // Private no-arg constructor for cloning
    private Contract() {
        // Empty - used only for cloning
    }

    @Override
    public DocumentPrototype clone() {
        System.out.println("⚡ Cloning Contract (fast operation)...");
        Contract cloned = new Contract();
        cloned.partyA = this.partyA;
        cloned.partyB = this.partyB;
        cloned.terms = this.terms;
        cloned.legalTemplate = this.legalTemplate;
        return cloned;
    }

    @Override
    public void showDetails() {
        System.out.println("   CONTRACT");
        System.out.println("   Party A: " + partyA);
        System.out.println("   Party B: " + partyB);
        System.out.println("   Terms: " + terms);
        System.out.println("   Legal Template: " + legalTemplate);
    }

    private void simulateExpensiveOperation() {
        try {
            Thread.sleep(1000); // Simulate loading legal template, validation, etc.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
