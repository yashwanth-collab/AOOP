package com.example;

public class CustomerSupportTicketSystem {
	    private java.util.LinkedList<Ticket> ticketQueue;

	    public CustomerSupportTicketSystem() {
	        this.ticketQueue = new java.util.LinkedList<>();
	    }

	    public void addTicket(Ticket ticket) {
	        ticketQueue.add(ticket);
	        System.out.println("Ticket added successfully!");
	    }

	    public void processNextTicket() {
	        if (ticketQueue.isEmpty()) {
	            System.out.println("No tickets to process.");
	            return;
	        }
	        Ticket ticket = ticketQueue.remove();
	        System.out.println("Processing ticket: " + ticket.getDescription());
	    }

	    public void displayPendingTickets() {
	        if (ticketQueue.isEmpty()) {
	            System.out.println("No pending tickets.");
	            return;
	        }
	        System.out.println("Pending tickets:");
	        for (java.util.Iterator<Ticket> iterator = ticketQueue.iterator(); iterator.hasNext();) {
	            Ticket ticket = iterator.next();
	            System.out.println(ticket.getDescription());
	        }
	    }
	}