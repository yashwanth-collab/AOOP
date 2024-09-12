package com.example;

public class Order {
	
	    private double price;
	    private java.util.HashMap<String, Double> condiments;

	    public Order() {
	        this.price = 10.0;
	        this.condiments = new java.util.HashMap<String, Double>();
	        this.condiments.put("Ketchup", 1.0);
	        this.condiments.put("Mustard", 0.5);
	        this.condiments.put("Mayo", 1.5);
	    }

	    public void addCondiment(String condiment) {
	        if (condiments.containsKey(condiment)) {
	            price += condiments.get(condiment);
	        }
	    }

	    public void removeCondiment(String condiment) {
	        if (condiments.containsKey(condiment)) {
	            price -= condiments.get(condiment);
	        }
	    }

	    public double getPrice() {
	        return price;
	    }
	}