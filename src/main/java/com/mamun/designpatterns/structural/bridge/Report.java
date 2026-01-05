package com.mamun.designpatterns.structural.bridge;

public abstract class Report {

    protected ReportGenerator generator;  // Bridge

    public Report(ReportGenerator generator) {
        this.generator = generator;
    }

    public abstract void createReport();


}
