package com.mamun.designpatterns.behavioral.momento;

public class MementoRun {

    public static void run (){

        ReviewHistory history = new ReviewHistory();
        // Initial code submission
        CodeReview review = new CodeReview("Hello Spring boot");

        System.out.println("--- Initial Submission ---");
        review.setStatus("Submitted");
        review.displayReview();
        history.push(review.save());

        // First review iteration
        System.out.println("\nFirst Review by Senior Developer : ");
        review.addReviewComment("Reviewer: Please add proper documentation");
        review.addReviewComment("Reviewer: Variable naming could be improved");
        review.setStatus("Changes Requested");
        review.displayReview();
        history.push(review.save());

        // Developer makes changes
        System.out.println("\nDeveloper Updates Code : ");
        review.updateCode("Updated Spring boot");
        review.setStatus("Re-submitted");
        review.displayReview();
        history.push(review.save());

        // Developer realizes mistake - wants to undo
        System.out.println("\nDeveloper Realizes Mistake - Undo Last Change: ");
        if (!history.isEmpty()) {
            review.restore(history.pop());
            review.displayReview();
        }

        // Undo one more time to initial state
        System.out.println("\n:Undo Again to Previous Review State: ");
        if (!history.isEmpty()) {
            review.restore(history.pop());
            review.displayReview();
        }

        // Undo to initial submission
        System.out.println("\nUndo to Initial Submission: ");
        if (!history.isEmpty()) {
            review.restore(history.pop());
            review.displayReview();
        }

    }

}
