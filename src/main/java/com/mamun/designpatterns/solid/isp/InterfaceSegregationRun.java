package com.mamun.designpatterns.solid.isp;

public class InterfaceSegregationRun {

    public static void run (){

        // Simple printer (only prints)
        Printer simplePrinter = new SimplePrinter();
        simplePrinter.print("Hello World!");

        System.out.println("---------------------");

        // Multi-function printer (print, scan, fax)
        MultiFunctionPrinter multiPrinter = new MultiFunctionPrinter();
        multiPrinter.print("Project Report");
        multiPrinter.scan("Project Report");
        multiPrinter.fax("Project Report");
    }

}
