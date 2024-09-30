package com.example;

public class bank {
	 public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000.0); // initial balance

	        // Create multiple threads to simulate users
	        Thread thread1 = new Thread(() -> {
	            account.deposit(500.0);
	            System.out.println("Thread 1: Deposited 500.0");
	        });

	        Thread thread2 = new Thread(() -> {
	            account.withdraw(200.0);
	            System.out.println("Thread 2: Withdrawn 200.0");
	        });

	        Thread thread3 = new Thread(() -> {
	            account.deposit(300.0);
	            System.out.println("Thread 3: Deposited 300.0");
	        });

	        // Start the threads
	        thread1.start();
	        thread2.start();
	        thread3.start();

	        // Wait for all threads to finish
	        try {
	            thread1.join();
	            thread2.join();
	            thread3.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Print the final balance
	        System.out.println("Final balance: " + account.getBalance());
	    }
}
