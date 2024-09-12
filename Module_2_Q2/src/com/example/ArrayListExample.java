package com.example;

public class ArrayListExample {
    public static void main(String[] args) {
        java.util.ArrayList<String> colors = new java.util.ArrayList<>();

        // Add elements to the ArrayList using add()
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("ArrayList after adding elements: " + colors);

        // Remove an element from the ArrayList using remove()
        colors.remove("Green");

        System.out.println("ArrayList after removing an element: " + colors);

        // Retrieve an element from the ArrayList using get()
        String firstColor = colors.get(0);

        System.out.println("First color: " + firstColor);

        // Get the size of the ArrayList using size()
        int size = colors.size();

        System.out.println("Size of ArrayList: " + size);
    }
}