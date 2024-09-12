package com.example;

//Subclass Maruthi that implements abstract methods
public class Maruthi extends Car {
 // Implementation of steering method
 @Override
 public void steering() {
     System.out.println("Maruthi is steering...");
 }

 // Implementation of braking method
 @Override
 public void braking() {
     System.out.println("Maruthi is braking...");
 }
}