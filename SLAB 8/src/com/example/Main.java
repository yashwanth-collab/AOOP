package com.example;

public class Main {
    public static void main(String[] args) {
        // Define an array of employees with their names and salaries
        String[][] employees = {
            {"John", "1000"},
            {"Alice", "2000"},
            {"Bob", "1500"},
            {"Charlie", "2500"},
            {"David", "3000"},
            {"Eve", "3500"},
            {"Frank", "4000"},
            {"George", "4500"},
            {"Hannah", "5000"},
            {"Ivan", "5500"}
        };

        // Convert the 2D array to a stream of Employee objects
        var employeeStream = java.util.Arrays.stream(employees)
                .map(employee -> new Object[]{employee[0], Integer.parseInt(employee[1])});

        // Filter employees with salary greater than 3000
        System.out.println("Employees with salary greater than 3000:");
        employeeStream.filter(employee -> (int) employee[1] > 3000)
                .forEach(employee -> System.out.println(employee[0] + ": " + employee[1]));

        // Reset the stream
        employeeStream = java.util.Arrays.stream(employees)
                .map(employee -> new Object[]{employee[0], Integer.parseInt(employee[1])});

        // Sort employees by salary in ascending order
        System.out.println("\nEmployees sorted by salary in ascending order:");
        employeeStream.sorted((e1, e2) -> ((int) e1[1] - (int) e2[1]))
                .forEach(employee -> System.out.println(employee[0] + ": " + employee[1]));

        // Reset the stream
        employeeStream = java.util.Arrays.stream(employees)
                .map(employee -> new Object[]{employee[0], Integer.parseInt(employee[1])});

        // Find the employee with the highest salary
        System.out.println("\nEmployee with the highest salary:");
        var highestSalaryEmployee = employeeStream.max((e1, e2) -> ((int) e1[1] - (int) e2[1]))
                .orElse(new Object[]{"", 0});
        System.out.println(highestSalaryEmployee[0] + ": " + highestSalaryEmployee[1]);

        // Reset the stream
        employeeStream = java.util.Arrays.stream(employees)
                .map(employee -> new Object[]{employee[0], Integer.parseInt(employee[1])});

        // Calculate the average salary
        System.out.println("\nAverage salary:");
        double averageSalary = employeeStream.mapToInt(employee -> (int) employee[1]).average().orElse(0);
        System.out.println(averageSalary);
    }
}