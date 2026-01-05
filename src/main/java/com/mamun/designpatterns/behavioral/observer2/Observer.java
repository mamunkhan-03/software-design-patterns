package com.mamun.designpatterns.behavioral.observer2;

public interface Observer {

    void update(float temperature, float humidity, String condition);
    String getDisplayName();
}
