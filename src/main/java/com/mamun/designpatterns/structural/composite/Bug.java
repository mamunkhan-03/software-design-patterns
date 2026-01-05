package com.mamun.designpatterns.structural.composite;

public class Bug extends WorkItem{

    int hours;

    public Bug(String id, String title, int hours) {
        super(id, title);
        this.hours = hours;
    }

    @Override
    void display(String indent) {
        System.out.println(indent + "Bug: " + id + " - " + title + " (" + hours + " hours)");
    }

    @Override
    int getHours() {
        return hours;
    }
}
