package com.example;

public class Client {
    public static void main(String[] args) {
        // Create products using the factory
        Product product1 = ProductFactory.createProduct("ConcreteProduct1");
        Product product2 = ProductFactory.createProduct("ConcreteProduct2");
        Product product3 = ProductFactory.createProduct("ConcreteProduct3");

        // Use the products
        product1.operation();
        product2.operation();
        product3.operation();

        // Demonstrate flexibility by creating a new product type
        Product newProduct = ProductFactory.createProduct("ConcreteProduct2");
        newProduct.operation();
    }
}