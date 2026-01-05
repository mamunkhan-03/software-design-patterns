package com.mamun.designpatterns.behavioral.iterator;

public class IteratorRun {

    public static void run () {

        Company company = new Company(6);

        System.out.println("Adding Employees : ");

        // Add employees
        company.addEmployee(new Employee("Md. Mamun Hossain", "Engineering", 50000));
        company.addEmployee(new Employee("Anisur Rahman", "Engineering", 60000));
        company.addEmployee(new Employee("Tipu Gazi", "Management", 70000));
        company.addEmployee(new Employee("Rashid Ahmed", "QA", 45000));
        company.addEmployee(new Employee("Sarah Khan", "HR", 55000));

        System.out.println("\nIterating Through All Employees: \n");

        Iterator iterator = company.createIterator();
        int count = 1;

        while (iterator.hasNext()) {
            System.out.println("Employee " + count + ":");
            Employee employee = (Employee) iterator.next();
            employee.displayInfo();
            System.out.println();
            count++;
        }

    }
}
