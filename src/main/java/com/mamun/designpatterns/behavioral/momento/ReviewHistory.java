package com.mamun.designpatterns.behavioral.momento;

public class ReviewHistory {

    private java.util.Stack<CodeReviewMemento> history = new java.util.Stack<>();

    public void push(CodeReviewMemento memento) {
        history.push(memento);
        System.out.println("State saved to history. Total saved states: " + history.size());
    }

    public CodeReviewMemento pop() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        System.out.println("No more history to restore!");
        return null;
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public int getHistorySize() {
        return history.size();
    }
}
