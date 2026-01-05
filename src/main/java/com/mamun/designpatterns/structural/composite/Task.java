package com.mamun.designpatterns.structural.composite;

public class Task extends WorkItem {

    int hours;

    public Task(String id, String title, int hours) {
        super(id, title);
        this.hours = hours;
    }

    @Override
    void display(String indent) {
        System.out.println(indent + "Task: " + id + " - " + title + " (" + hours + " hours)");
    }

    @Override
    int getHours() {
        return hours;
    }

}
