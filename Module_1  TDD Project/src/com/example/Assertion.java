package com.example;

public class Assertion {
	public static void assertDoubleEquals(double expected, double actual, double delta) {
        if (Math.abs(expected - actual) > delta) {
            System.out.println("Assertion failed: expected " + expected + " but was " + actual);
        }
    }
}
