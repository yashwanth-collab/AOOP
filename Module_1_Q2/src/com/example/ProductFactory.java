package com.example;

public class ProductFactory {
    public static Product createProduct(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("ConcreteProduct1")) {
            return new ConcreteProduct1();
        } else if (type.equalsIgnoreCase("ConcreteProduct2")) {
            return new ConcreteProduct2();
        } else if (type.equalsIgnoreCase("ConcreteProduct3")) {
            return new ConcreteProduct3();
        }
        return null;
    }
}