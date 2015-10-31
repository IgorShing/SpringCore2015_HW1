package com.cinema.manager.controller.service;

import java.util.Date;
import java.util.List;

import com.cinema.manager.model.Auditorium;
import com.cinema.manager.model.Event;
import com.cinema.manager.model.Ratings;

public class EventServiceImpl implements EventService {

	public boolean create(String name, Date date, float ticketPrice,
	        Ratings rating) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Event getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Event> getAll() {
		// TODO Auto-generated method stub
		return null;
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

}
