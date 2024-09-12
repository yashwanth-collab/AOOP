package com.example;

public class Main {
    public static void main(String[] args) {
        // Define a list of strings
        String[] strings = {"dog", "cat", "apple", "zebra", "elephant"};

        // Use a lambda expression as the comparator for the bubble sort algorithm
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].compareToIgnoreCase(strings[j]) < 0) {
                    // Swap strings[i] and strings[j]
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        // Print the sorted list
        for (String str : strings) {
            System.out.println(str);
        }
    }
}