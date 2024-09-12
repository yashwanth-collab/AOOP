package com.example;

class EmployeeComparator implements java.util.Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        // Compare employees based on their age
        return Integer.compare(e1.getAge(), e2.getAge());
    }
}