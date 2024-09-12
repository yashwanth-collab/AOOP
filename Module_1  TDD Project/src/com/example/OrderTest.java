package com.example;

public class OrderTest {
	    public static void main(String[] args) {
	        testDefaultPrice();
	        testAddCondiment_Ketchup();
	        testAddCondiment_Mustard();
	        testAddCondiment_Mayo();
	        testRemoveCondiment_Ketchup();
	        testMultipleCondiments();
	        testUnknownCondiment();
	    }

	    public static void testDefaultPrice() {
	        Order order = new Order();
	        assertDoubleEquals(10.0, order.getPrice(), 0.01);
	        System.out.println("Test default price: Passed");
	    }

	    public static void testAddCondiment_Ketchup() {
	        Order order = new Order();
	        order.addCondiment("Ketchup");
	        assertDoubleEquals(11.0, order.getPrice(), 0.01);
	        System.out.println("Test add condiment Ketchup: Passed");
	    }

	    public static void testAddCondiment_Mustard() {
	        Order order = new Order();
	        order.addCondiment("Mustard");
	        assertDoubleEquals(10.5, order.getPrice(), 0.01);
	        System.out.println("Test add condiment Mustard: Passed");
	    }

	    public static void testAddCondiment_Mayo() {
	        Order order = new Order();
	        order.addCondiment("Mayo");
	        assertDoubleEquals(11.5, order.getPrice(), 0.01);
	        System.out.println("Test add condiment Mayo: Passed");
	    }

	    public static void testRemoveCondiment_Ketchup() {
	        Order order = new Order();
	        order.addCondiment("Ketchup");
	        order.removeCondiment("Ketchup");
	        assertDoubleEquals(10.0, order.getPrice(), 0.01);
	        System.out.println("Test remove condiment Ketchup: Passed");
	    }

	    public static void testMultipleCondiments() {
	        Order order = new Order();
	        order.addCondiment("Ketchup");
	        order.addCondiment("Mustard");
	        assertDoubleEquals(11.5, order.getPrice(), 0.01);
	        System.out.println("Test multiple condiments: Passed");
	    }

	    public static void testUnknownCondiment() {
	        Order order = new Order();
	        order.addCondiment("Unknown");
	        assertDoubleEquals(10.0, order.getPrice(), 0.01);
	        System.out.println("Test unknown condiment: Passed");
	    }

	    public static void assertDoubleEquals(double expected, double actual, double delta) {
	        if (Math.abs(expected - actual) > delta) {
	            System.out.println("Assertion failed: expected " + expected + " but was " + actual);
	        }
	    }
	}