package com.mamun.designpatterns.structural.bridge;

public class ExcelGenerator implements ReportGenerator{

    @Override
    public void generate(String title, String content) {
        System.out.println("Generating Excel Report: " + title);
        System.out.println("Content: " + content);
        System.out.println("File saved: " + title + ".xlsx\n");
    }
}
