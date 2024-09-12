package com.example;
import java.util.ArrayList;
import java.util.List;

class Coffee {
    private String type;
    private List<String> condiments;

    public Coffee(String type) {
        this.type = type;
        this.condiments = new ArrayList<>();
    }

    public void addCondiment(String condiment) {
        this.condiments.add(condiment);
    }

    public String getType() {
        return type;
    }

    public List<String> getCondiments() {
        return condiments;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", condiments=" + condiments +
                '}';
    }
}

class CoffeeShop {
    public Coffee createCoffee(String type) {
        return new Coffee(type);
    }

    public void displayCoffee(Coffee coffee) {
        System.out.println("Coffee Type: " + coffee.getType());
        System.out.println("Condiments: " + coffee.getCondiments());
        System.out.println();
    }
}

