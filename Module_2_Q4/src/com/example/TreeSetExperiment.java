package com.example;

public class TreeSetExperiment {
    public static void main(String[] args) {
        // Create a TreeSet to store String objects
        java.util.TreeSet<String> treeSet = new java.util.TreeSet<>();

        // Add five String objects to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Elderberry");

        System.out.println("Initial TreeSet: ");
        printTreeSet(treeSet);

        // Remove an element from the TreeSet
        treeSet.remove("Banana");

        System.out.println("After removing 'Banana': ");
        printTreeSet(treeSet);

        // Add a new element to the TreeSet
        treeSet.add("Fig");

        System.out.println("After adding 'Fig': ");
        printTreeSet(treeSet);
    }

    // Method to print the TreeSet using an Iterator
    public static void printTreeSet(java.util.TreeSet<String> treeSet) {
        java.util.Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}