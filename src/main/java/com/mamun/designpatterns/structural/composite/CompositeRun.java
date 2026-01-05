package com.mamun.designpatterns.structural.composite;

public class CompositeRun {

    public static void  run(){
        Feature authFeature = new Feature("F-001", "User Authentication");

        UserStory story1 = new UserStory("US-101", "User Login", 5);
        Task task1 = new Task("T-201", "Design login page", 4);
        Task task2 = new Task("T-202", "Create API endpoint", 6);
        Bug bug1 = new Bug("B-301", "Fix login button", 2);

        story1.addChild(task1);
        story1.addChild(task2);
        story1.addChild(bug1);

        UserStory story2 = new UserStory("US-102", "Password Reset", 3);
        Task task3 = new Task("T-203", "Design reset form", 3);
        Task task4 = new Task("T-204", "Send reset email", 4);

        story2.addChild(task3);
        story2.addChild(task4);

        // Add stories to feature
        authFeature.addStory(story1);
        authFeature.addStory(story2);

        // Display the complete tree
        authFeature.display("");


//        System.out.println("Total hours for entire Feature: " + authFeature.getHours());
//        System.out.println("Total hours for Story 1: " + story1.getHours());
//        System.out.println("Total hours for Story 2: " + story2.getHours());
//        System.out.println("Hours for single Task: " + task1.getHours());
//
//        System.out.println("\n✅ Same getHours() method works at ALL levels!");
//        System.out.println("   - Feature level (contains stories)");
//        System.out.println("   - Story level (contains tasks/bugs)");
//        System.out.println("   - Task/Bug level (individual items)");
//        System.out.println();
    }
}
