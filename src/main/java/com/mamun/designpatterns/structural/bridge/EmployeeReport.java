package com.mamun.designpatterns.structural.bridge;

public class EmployeeReport extends Report{

    private String department;
    private int totalEmployees;

    public EmployeeReport(ReportGenerator generator, String department, int totalEmployees) {
        super(generator);
        this.department = department;
        this.totalEmployees = totalEmployees;
    }

    @Override
    public void createReport() {
        String title = "Employee Report - " + department;
        String content = "Total Employees: " + totalEmployees;
        generator.generate(title, content);
    }
}
