package com.mamun.designpatterns.creational.prototype;

public class PrototypeRun {

    public static void run (){


        System.out.println("Creating Original Invoice Template : ");
        long startTime = System.currentTimeMillis();
        Invoice originalInvoice = new Invoice(
                "ABC Corporation",
                "INV-001",
                1000.00,
                "Standard Invoice Template v2.0"
        );
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms\n");
        originalInvoice.showDetails();

        System.out.println("\n\n");
        startTime = System.currentTimeMillis();
        DocumentPrototype clonedDoc2 = originalInvoice.clone();
        Invoice invoice2 = (Invoice) clonedDoc2;
        endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms\n");

        invoice2.showDetails();
    }
}
