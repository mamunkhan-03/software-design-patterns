package com.mamun.designpatterns.behavioral.chainOfResponsibility;

public class ChainOfResponsibilityRun {

    public static void run (){

        LoanApprover loanOfficer = new LoanOfficer();
        LoanApprover branchManager = new BranchManager();
        LoanApprover regionalManager = new RegionalManager();
        LoanApprover creditCommittee = new CreditCommittee();

        // Link the chain
        loanOfficer.setNextApprover(branchManager);
        branchManager.setNextApprover(regionalManager);
        regionalManager.setNextApprover(creditCommittee);

        //Personal small loan
        System.out.println("\nApplication 1: Personal Loan: ");
        LoanApplication loan1 = new LoanApplication(
                "Md. Mamun Hossain",
                5000.00,
                "Home Renovation"
        );
        loan1.displayApplication();
        loanOfficer.processLoan(loan1);


        // Car loan (Branch Manager approves)
        System.out.println("\nApplication 2: Auto Loan: ");
        LoanApplication loan2 = new LoanApplication(
                "Anisur Rahman",
                35000.00,
                "Vehicle Purchase"

        );
        loan2.displayApplication();
        loanOfficer.processLoan(loan2);



        //Business loan (Regional Manager approves)
        System.out.println("\nApplication 3: Business Loan : ");
        LoanApplication loan3 = new LoanApplication(
                "Tipu Gazi",
                150000.00,
                "Business Expansion"

        );
        loan3.displayApplication();
        loanOfficer.processLoan(loan3);

        //Large commercial loan (Credit Committee approves)
        System.out.println("\nApplication 4: Commercial Real Estate : ");
        LoanApplication loan4 = new LoanApplication(
                "ABC Corporation",
                500000.00,
                "Commercial Property Purchase"

        );
        loan4.displayApplication();
        loanOfficer.processLoan(loan4);

        // loan rejected due to credit score
        System.out.println("\nApplication 5: High Amount : ");
        LoanApplication loan5 = new LoanApplication(
                "Tech Ventures LLC",
                300000000.00,
                "Equipment Purchase"
        );
        loan5.displayApplication();
        loanOfficer.processLoan(loan5);

        System.out.println("\n" + "=".repeat(70));
    }

}
