package com.mamun.designpatterns.structural.bridge;

public class FinancialReport extends Report {

    private String quarter;
    private double revenue;
    private double expenses;

    public FinancialReport(ReportGenerator generator, String quarter, double revenue, double expenses) {
        super(generator);
        this.quarter = quarter;
        this.revenue = revenue;
        this.expenses = expenses;
    }

    @Override
    public void createReport() {
        String title = "Financial Report - " + quarter;
        double profit = revenue - expenses;
        String content = "Revenue: Tk " + revenue + ", Expenses: Tk " + expenses + ", Profit: Tk " + profit;
        generator.generate(title, content);
    }
}
