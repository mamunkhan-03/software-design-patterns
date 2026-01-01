package com.mamun.designpatterns.solid.dip;

public interface VersionControl {
    void commit(String message);
    void push();
    void pull();
}
