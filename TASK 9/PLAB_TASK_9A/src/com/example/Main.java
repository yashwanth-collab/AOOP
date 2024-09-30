package com.example;

//Main class
public class Main {
 public static void main(String[] args) {
     // Create and start the threads
     Thread t1 = new Thread(new PrintTwo());
     Thread t2 = new Thread(new PrintThree());
     Thread t3 = new Thread(new PrintFour());
     Thread t4 = new Thread(new PrintFive());
     Thread t5 = new Thread(new PrintNumber());

     t1.start();
     t2.start();
     t3.start();
     t4.start();
     t5.start();
 }
}

//Runnable class for printTwo
class PrintTwo implements Runnable {
 @Override
 public void run() {
     for (int i = 1; i <= 15; i++) {
         if (i % 2 == 0) {
             System.out.println("PrintTwo: " + i);
         }
     }
 }
}

//Runnable class for printThree
class PrintThree implements Runnable {
 @Override
 public void run() {
     for (int i = 1; i <= 15; i++) {
         if (i % 3 == 0) {
             System.out.println("PrintThree: " + i);
         }
     }
 }
}

//Runnable class for printFour
class PrintFour implements Runnable {
 @Override
 public void run() {
     for (int i = 1; i <= 15; i++) {
         if (i % 4 == 0) {
             System.out.println("PrintFour: " + i);
         }
     }
 }
}

//Runnable class for printFive
class PrintFive implements Runnable {
 @Override
 public void run() {
     for (int i = 1; i <= 15; i++) {
         if (i % 5 == 0) {
             System.out.println("PrintFive: " + i);
         }
     }
 }
}

//Runnable class for printNumber
class PrintNumber implements Runnable {
 @Override
 public void run() {
     for (int i = 1; i <= 15; i++) {
         if (i % 2 != 0 && i % 3 != 0 && i % 4 != 0 && i % 5 != 0) {
             System.out.println("PrintNumber: " + i);
         }
     }
 }
}