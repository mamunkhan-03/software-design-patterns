package com.mamun.designpatterns.behavioral.observer;

public class ObserverRun {

    public static void run() {

        System.out.println("========== MICROSOFT TEAMS - ERA ALL EMPLOYEE ==========");
        System.out.println("Company: Enhanced Research & Analytics (ERA)\n");

        // Create Teams Group
        ERAAllEmployeeGroup eraGroup = new ERAAllEmployeeGroup();

        System.out.println("--- HR Adding Members to Group ---\n");

        // Create employees
        GroupMember sarah = new HRManager("Sarah Khan");
        GroupMember mamun = new SoftwareEngineer("Md. Mamun Hossain");
        GroupMember anisur = new SoftwareEngineer("Anisur Rahman");
        GroupMember tipu = new ProjectManager("Tipu Gazi");
        GroupMember rashid = new QAEngineer("Rashid Ahmed");

        // HR adds all employees to group
        eraGroup.addMember(sarah);
        eraGroup.addMember(mamun);
        eraGroup.addMember(anisur);
        eraGroup.addMember(tipu);
        eraGroup.addMember(rashid);

        System.out.println("\n" + "=".repeat(60));

        // Scenario 1: HR sends company holiday announcement
        System.out.println("\n--- Scenario 1: Holiday Announcement ---");
        eraGroup.sendMessage(sarah,
                "📅 Reminder: Office will be closed tomorrow for public holiday. Enjoy!");

        System.out.println("\n" + "=".repeat(60));

        // Scenario 2: Project Manager sends meeting reminder
        System.out.println("\n--- Scenario 2: Meeting Reminder ---");
        eraGroup.sendMessage(tipu,
                "Team, sprint planning meeting at 3 PM today. Please be on time!");

        System.out.println("\n" + "=".repeat(60));

        // Scenario 3: Developer asks a question
        System.out.println("\n--- Scenario 3: Developer Question ---");
        eraGroup.sendMessage(mamun,
                "Does anyone have access to the production database? Need to check something.");

        System.out.println("\n" + "=".repeat(60));

        // Scenario 4: Senior Developer responds
        System.out.println("\n--- Scenario 4: Developer Response ---");
        eraGroup.sendMessage(anisur,
                "Yes Mamun, I have access. I'll help you after lunch. Let's connect at 2 PM.");

        System.out.println("\n" + "=".repeat(60));

        // Scenario 5: Employee leaves company (HR removes from group)
        System.out.println("\n--- Scenario 5: Employee Resignation ---\n");
        eraGroup.removeMember(anisur);
        System.out.println("   (Anisur left the company)");

        System.out.println("\n" + "=".repeat(60));

        // Scenario 6: HR sends announcement (Anisur won't receive)
        System.out.println("\n--- Scenario 6: Announcement After Employee Left ---");
        eraGroup.sendMessage(sarah,
                "📢 Important: Performance review meetings scheduled for next week. Check your calendar.");

        System.out.println("\n" + "=".repeat(60));

        // Scenario 7: New employee joins
        System.out.println("\n--- Scenario 7: New Employee Onboarding ---\n");
        GroupMember karim = new SoftwareEngineer("Karim Hassan");
        eraGroup.addMember(karim);
        System.out.println("   (New developer joined the company)");

        System.out.println("\n" + "=".repeat(60));

        // Scenario 8: HR welcomes new member
        System.out.println("\n--- Scenario 8: Welcome Message ---");
        eraGroup.sendMessage(sarah,
                "👋 Please welcome Karim Hassan to our team! He's joining as Software Engineer. Welcome aboard Karim!");

        System.out.println("\n" + "=".repeat(60));

        // Scenario 9: QA sends update
        System.out.println("\n--- Scenario 9: QA Update ---");
        eraGroup.sendMessage(rashid,
                "Testing completed for the new feature. All test cases passed! ✅");

        System.out.println("\n" + "=".repeat(60));

        System.out.println("\n💡 Perfect Observer Pattern - Teams Group:");
        System.out.println("   ✅ One message → ALL group members notified");
        System.out.println("   ✅ Works exactly like Microsoft Teams group chat");
        System.out.println("   ✅ HR can add/remove members (join/leave company)");
        System.out.println("   ✅ Everyone gets same message simultaneously");
        System.out.println("   ✅ Notifications on desktop + mobile");
        System.out.println("   ✅ Real-life broadcast communication!");
    }
}
