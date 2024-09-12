package com.example;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create employee objects
        Employee e1 = new Employee("John", 30, 50000.0);
        Employee e2 = new Employee("Alice", 25, 60000.0);
        Employee e3 = new Employee("Bob", 35, 40000.0);

        // Create EmployeeComparable objects
        EmployeeComparable ec1 = new EmployeeComparable("John", 30, 50000.0);
        EmployeeComparable ec2 = new EmployeeComparable("Alice", 25, 60000.0);
        EmployeeComparable ec3 = new EmployeeComparable("Bob", 35, 40000.0);

        // Create arrays
        Employee[] employees = {e1, e2, e3};
        EmployeeComparable[] employeeComparables = {ec1, ec2, ec3};

        // Sort employees using Comparator
        java.util.Arrays.sort(employees, new EmployeeComparator());

        // Sort employeeComparables using Comparable
        java.util.Arrays.sort(employeeComparables);

        // Print sorted employees
        System.out.println("Sorted Employees (by age):");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Print sorted employeeComparables
        System.out.println("\nSorted EmployeeComparables (by salary):");
        for (EmployeeComparable employeeComparable : employeeComparables) {
            System.out.println(employeeComparable);
        }

        // Clone an employee
        Employee clonedEmployee = (Employee) e1.clone();
        System.out.println("\nCloned Employee:");
        System.out.println(clonedEmployee);
    }
}