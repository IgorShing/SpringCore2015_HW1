package com.cinema.manager.model;

import java.util.List;

/**
 * Describes all tickets booked by a user
 * 
 * @author Admin
 *
 */
public class Booking {

	private int	         id;
	private int	         userId;
	private List<Ticket>	tickets;

	public Booking(int id, int userId, List<Ticket> tickets) {
		super();
		this.id = id;
		this.userId = userId;
		this.tickets = tickets;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

}
