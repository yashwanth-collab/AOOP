package com.example;
class EmployeeComparable extends Employee implements java.lang.Comparable<EmployeeComparable> {
    public EmployeeComparable(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public int compareTo(EmployeeComparable e) {
        // Compare employees based on their salary
        return Double.compare(this.getSalary(), e.getSalary());
    }
}