package com.example;

public class Main {
	    public static void main(java.lang.String[] args) {
	        CustomerSupportTicketSystem ticketSystem = new CustomerSupportTicketSystem();

	        ticketSystem.addTicket(new Ticket("Ticket 1: Login issue"));
	        ticketSystem.addTicket(new Ticket("Ticket 2: Payment problem"));
	        ticketSystem.addTicket(new Ticket("Ticket 3: Product query"));

	        ticketSystem.displayPendingTickets();

	        ticketSystem.processNextTicket();
	        ticketSystem.processNextTicket();

	        ticketSystem.displayPendingTickets();
	    }
	}