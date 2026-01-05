package com.mamun.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class UserStory extends WorkItem {

    List<WorkItem> children = new ArrayList<>();
    int storyPoints;

    public UserStory(String id, String title, int storyPoints) {
        super(id, title);
        this.storyPoints = storyPoints;
    }

    void addChild(WorkItem item) {
        children.add(item);
    }

    @Override
    void display(String indent) {
        System.out.println(indent + "User Story: " + id + " - " + title +
                " (Points: " + storyPoints + ", Total Hours: " + getHours() + ")");

        for (WorkItem child : children) {
            child.display(indent + "  ");
        }
    }

    @Override
    int getHours() {
        int total = 0;
        for (WorkItem child : children) {
            total += child.getHours();
        }
        return total;
    }
}
