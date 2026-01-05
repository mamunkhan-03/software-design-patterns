package com.mamun.designpatterns.structural.bridge;

public class CSVGenerator implements ReportGenerator{

    @Override
    public void generate(String title, String content) {
        System.out.println("Generating CSV Report: " + title);
        System.out.println("Content: " + content);
        System.out.println("File saved: " + title + ".csv\n");
    }
}
