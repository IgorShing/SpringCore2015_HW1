package com.cinema.manager.model;

import java.util.Date;

public class Event {

	private String	id;
	private String	name;
	private Date	date;
	private float	ticketPrice;
	private Ratings	rating;

	public Event(String id, String name, Date date, float ticketPrice,
			Ratings rating) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.ticketPrice = ticketPrice;
		this.rating = rating;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Ratings getRating() {
		return rating;
	}

	public void setRating(Ratings rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + Float.floatToIntBits(ticketPrice);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rating != other.rating)
			return false;
		if (Float.floatToIntBits(ticketPrice) != Float
				.floatToIntBits(other.ticketPrice))
			return false;
		return true;
	}
}
