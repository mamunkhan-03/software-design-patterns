package com.mamun.designpatterns.structural.composite;

public abstract class WorkItem {
    String id;
    String title;

    public WorkItem(String id, String title) {
        this.id = id;
        this.title = title;
    }

    // Methods that ALL work items must have
    abstract void display(String indent);
    abstract int getHours();
}
