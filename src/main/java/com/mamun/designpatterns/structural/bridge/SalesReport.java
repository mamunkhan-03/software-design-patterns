package com.mamun.designpatterns.structural.bridge;

public class SalesReport extends Report{

    private String month;
    private double totalSales;

    public SalesReport(ReportGenerator generator, String month, double totalSales) {
        super(generator);
        this.month = month;
        this.totalSales = totalSales;
    }

    @Override
    public void createReport() {
        String title = "Sales Report - " + month;
        String content = "Total Sales: Tk " + totalSales;
        generator.generate(title, content);
    }
}
