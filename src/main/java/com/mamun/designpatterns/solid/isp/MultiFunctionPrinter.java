package com.mamun.designpatterns.solid.isp;

public class MultiFunctionPrinter implements Printer, Scanner, Fax{

    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("Faxing: " + document);
    }
}
