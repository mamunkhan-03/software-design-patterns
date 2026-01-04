package com.mamun.designpatterns.behavioral.momento;

public class CodeReviewMemento {

    private String code;
    private String reviewComments;
    private String status;

    public CodeReviewMemento(String code, String reviewComments, String status) {
        this.code = code;
        this.reviewComments = reviewComments;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public String getReviewComments() {
        return reviewComments;
    }

    public String getStatus() {
        return status;
    }
}
