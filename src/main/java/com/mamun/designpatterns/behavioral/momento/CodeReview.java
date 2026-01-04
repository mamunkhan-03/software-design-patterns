package com.mamun.designpatterns.behavioral.momento;

public class CodeReview {

    private String code;
    private String reviewComments;
    private String status;

    public CodeReview(String initialCode) {
        this.code = initialCode;
        this.reviewComments = "";
        this.status = "Draft";
    }

    public void updateCode(String newCode) {
        this.code = newCode;
    }

    public void addReviewComment(String comment) {
        if (this.reviewComments.isEmpty()) {
            this.reviewComments = comment;
        } else {
            this.reviewComments += "\n" + comment;
        }
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Save current state to memento
    public CodeReviewMemento save() {
        System.out.println("Saving code review state.");
        return new CodeReviewMemento(code, reviewComments, status);
    }

    // Restore state from memento
    public void restore(CodeReviewMemento memento) {
        this.code = memento.getCode();
        this.reviewComments = memento.getReviewComments();
        this.status = memento.getStatus();
        System.out.println("Code review state restored!");
    }

    public void displayReview() {

        System.out.println("Code Review Details:");
        System.out.println("Status: " + status);
        System.out.println("Code:\n" + code);
        System.out.println("Review Comments:\n" + (reviewComments.isEmpty() ? "No comments yet" : reviewComments));

    }
}
