package com.mamun.designpatterns.behavioral.iterator;

public class Company implements EmployeeCollection{
    private Employee[] employees;
    private int position = 0;

    public Company(int size) {
        employees = new Employee[size];
    }

    public void addEmployee(Employee employee) {
        if (position < employees.length) {
            employees[position] = employee;
            position++;
        } else {
            System.out.println("Company is at full capacity!");
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompanyIterator(employees);
    }
}
