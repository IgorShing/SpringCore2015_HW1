package com.cinema.manager.controller.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cinema.manager.model.Auditorium;
import com.cinema.manager.model.Event;
import com.cinema.manager.model.Ratings;
import com.cinema.manager.utils.RandomGenerator;

public class EventDaoImpl implements EventDao {

	private static final int	ID_LENGTH	            = 10;
	private static final int	ATTEMPTS_TO_GENERATE_ID	= 10;
	private static final String	ID_GENERATING_ERROR	    = "Unable tp generate id for the event.";

	Map<String, Event>	        events;

	public boolean create(String name, Date date, float ticketPrice,
			Ratings rating) throws Exception {

		String id = generateEventId();
		events.put(id, new Event(id, name, date, ticketPrice, rating));

		return true;
	}

	public boolean remove(String id) {
		if (events != null && events.remove(id) != null) {
			return true;
		}
		return false;
	}

	public List<Event> getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Event> getAll() {
		if (events == null) {
			return null;
		}
		List<Event> allEvents = new ArrayList<Event>();
		allEvents.addAll(events.values());
		return allEvents;
	}

	public List<Event> getForDateRange(Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Event> getNextEvents(Date toDate) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean assignAuditorium(Event event, Auditorium auditorium,
			Date date) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Generates an id for an event.
	 *
	 * @return
	 */
	private String generateEventId() throws Exception {
		Set<String> eventIds = events.keySet();
		String newId = RandomGenerator.generateRandomString(ID_LENGTH);
		int counter = 1;

		while (!eventIds.contains(newId) || counter++ < ATTEMPTS_TO_GENERATE_ID) {
			newId = RandomGenerator.generateRandomString(ID_LENGTH);
		}

		if (counter >= ATTEMPTS_TO_GENERATE_ID) {
			throw new Exception(ID_GENERATING_ERROR);
		}

		return newId;
	}
}
