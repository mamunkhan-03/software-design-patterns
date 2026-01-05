package com.mamun.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Feature extends WorkItem{

    List<UserStory> stories = new ArrayList<>();

    public Feature(String id, String title) {
        super(id, title);
    }

    void addStory(UserStory story) {
        stories.add(story);
    }

    @Override
    void display(String indent) {
        System.out.println(indent + "Feature: " + id + " - " + title +
                " (Total Hours: " + getHours() + ")");

        for (UserStory story : stories) {
            story.display(indent + "  ");
        }
    }

    @Override
    int getHours() {
        int total = 0;
        for (UserStory story : stories) {
            total += story.getHours();
        }
        return total;
    }
}
