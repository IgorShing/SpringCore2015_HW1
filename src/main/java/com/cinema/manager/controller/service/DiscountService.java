package com.cinema.manager.controller.service;

import com.cinema.manager.model.Event;
import com.cinema.manager.model.User;

public interface DiscountService {

	/**
	 * Returns discount for each ticket for the user on particular event
	 */
	float getDiscount(User user, Event event);

}
