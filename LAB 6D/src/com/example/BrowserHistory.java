package com.example;

public class BrowserHistory {
	    private java.util.ArrayDeque<java.lang.String> history;

	    public BrowserHistory() {
	        this.history = new java.util.ArrayDeque<>();
	    }

	    public void addPage(java.lang.String page) {
	        history.addLast(page);
	        System.out.println("Page added: " + page);
	    }

	    public void goBack() {
	        if (history.size() < 2) {
	            System.out.println("Cannot go back.");
	            return;
	        }
	        history.removeLast();
	        System.out.println("Going back to: " + history.getLast());
	    }

	    public void goForward() {
	        // This method is not implemented correctly, as we don't have a way to keep track of the current position in the history
	        if (history.isEmpty()) {
	            System.out.println("Cannot go forward.");
	            return;
	        }
	        System.out.println("Going forward to: " + history.getLast());
	    }

	    public void displayCurrentPage() {
	        if (history.isEmpty()) {
	            System.out.println("No pages in history.");
	            return;
	        }
	        System.out.println("Current page: " + history.getLast());
	    }
	}