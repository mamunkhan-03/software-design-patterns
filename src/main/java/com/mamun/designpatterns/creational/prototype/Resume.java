package com.mamun.designpatterns.creational.prototype;

public class Resume implements DocumentPrototype{

    private String name;
    private String experience;
    private String education;
    private String skills;

    public Resume(String name, String experience, String education, String skills) {
        this.name = name;
        this.experience = experience;
        this.education = education;
        this.skills = skills;

        System.out.println("Creating new Resume (expensive operation)");
        simulateExpensiveOperation();
    }

   // Private no-arg constructor for cloning
    private Resume() {
        // Empty - used only for cloning
    }

    @Override
    public DocumentPrototype clone() {
        System.out.println("⚡ Cloning Resume (fast operation)...");
        Resume cloned = new Resume();
        cloned.name = this.name;
        cloned.experience = this.experience;
        cloned.education = this.education;
        cloned.skills = this.skills;
        return cloned;
    }

    @Override
    public void showDetails() {
        System.out.println("   RESUME");
        System.out.println("   Name: " + name);
        System.out.println("   Experience: " + experience);
        System.out.println("   Education: " + education);
        System.out.println("   Skills: " + skills);
    }

    private void simulateExpensiveOperation() {
        try {
            Thread.sleep(1000); // Simulate loading template, formatting, etc.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
