package com.mamun.designpatterns.structural.bridge;

public class PDFGenerator implements ReportGenerator{

    @Override
    public void generate(String title, String content) {
        System.out.println("Generating PDF Report: " + title);
        System.out.println("Content: " + content);
        System.out.println("File saved: " + title + ".pdf\n");
    }
}
