package com.mamun.designpatterns.behavioral.iterator;

public class CompanyIterator implements Iterator{

    private Employee[] employees;
    private int currentPosition = 0;

    public CompanyIterator(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < employees.length && employees[currentPosition] != null;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Employee employee = employees[currentPosition];
            currentPosition++;
            return employee;
        }
        return null;
    }
}
