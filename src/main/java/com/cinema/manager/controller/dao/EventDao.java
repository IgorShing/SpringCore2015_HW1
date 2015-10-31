package com.cinema.manager.controller.dao;

import java.util.Date;
import java.util.List;

import com.cinema.manager.model.Auditorium;
import com.cinema.manager.model.Event;
import com.cinema.manager.model.Ratings;

public interface EventDao {

	/**
	 * Create Event with name, air dates and times, base price for tickets,
	 * rating (high, mid, low)
	 *
	 * @param name
	 * @param date
	 * @param ticketPrice
	 * @param rating
	 * @return
	 */
	boolean create(String name, Date date, float ticketPrice, Ratings rating)
			throws Exception;

	boolean remove(String id);

	List<Event> getByName(String name);

	List<Event> getAll();

	// Returns events for specified date range
	List<Event> getForDateRange(Date fromDate, Date toDate);

	// Returns events from now till the ‘to’ date
	List<Event> getNextEvents(Date toDate);

	// Assign auditorium for event for specific date
	boolean assignAuditorium(Event event, Auditorium auditorium, Date date);
}
