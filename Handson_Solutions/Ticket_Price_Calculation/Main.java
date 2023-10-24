package Ticket_Price_Calculation;

import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of bookings:");
		int n = s.nextInt();
		System.out.println("Enter the available tickets:");
		int at = s.nextInt();
		
		Ticket t = new Ticket();
		t.setAvailableTickets(at);
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the ticketid:");
			int tid = s.nextInt();
			System.out.println("Enter the price:");
			int pr = s.nextInt();
			System.out.println("Enter the no of tickets:");
			int nb = s.nextInt();
			t.setTicketid(tid);
			t.setPrice(pr);
			System.out.println("Available tickets:"+t.getAvailableTickets());
			System.out.println("Total amount:"+t.calculateTicketCost(nb));
			System.out.println("Available ticket after booking:"+t.getAvailableTickets());
		}

	}

}
