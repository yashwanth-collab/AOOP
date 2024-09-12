package com.example;

public class Main {
	public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();

        Coffee coffee1 = coffeeShop.createCoffee("Latte");
        coffee1.addCondiment("Milk");
        coffee1.addCondiment("Sugar");

        Coffee coffee2 = coffeeShop.createCoffee("Mocha");
        coffee2.addCondiment("Whipped Cream");
        coffee2.addCondiment("Chocolate Chips");

        coffeeShop.displayCoffee(coffee1);
        coffeeShop.displayCoffee(coffee2);
    }
}
