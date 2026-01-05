package com.mamun.designpatterns.behavioral.iterator;

public class Employee {

    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void displayInfo() {
        System.out.println("   Name: " + name);
        System.out.println("   Department: " + department);
        System.out.println("   Salary: Tk " + String.format("%.2f", salary));
    }
}
