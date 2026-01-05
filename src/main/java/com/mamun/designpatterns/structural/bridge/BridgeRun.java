package com.mamun.designpatterns.structural.bridge;

public class BridgeRun {

    public static void run (){

        // Sales Report as PDF
        Report salesPDF = new SalesReport(new PDFGenerator(), "January 2026", 150000);
        salesPDF.createReport();

        // Employee Report as Excel
        Report employeeExcel = new EmployeeReport(new ExcelGenerator(), "IT Department", 25);
        employeeExcel.createReport();

        // Financial Report as CSV
        Report financialCSV = new FinancialReport(new CSVGenerator(), "Q1 2026", 500000, 350000);
        financialCSV.createReport();

        // Same Sales Report but in Excel format
        Report salesExcel = new SalesReport(new ExcelGenerator(), "January 2026", 150000);
        salesExcel.createReport();

        // Same Financial Report but in PDF format
        Report financialPDF = new FinancialReport(new PDFGenerator(), "Q1 2026", 500000, 350000);
        financialPDF.createReport();
    }
}
