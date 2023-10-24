package Ticket_Price_Calculation;

public class Ticket
{
	private int ticketid;
	private int price;
	private static int availableTickets;
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availabljeTickets)
	{
		if(availabljeTickets > 0)
		{
			availableTickets = availabljeTickets;
		}
		
	}
	
	public int calculateTicketCost(int nooftickets)
	{
		if(availableTickets > nooftickets)
		{
			availableTickets-=nooftickets;
			int total_amount = nooftickets*price;
			return total_amount;
		}
		else
		{
			return -1;
		}
		
	}
	
	
}
