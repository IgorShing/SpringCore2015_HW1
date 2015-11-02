package com.cinema.manager.controller;

import com.cinema.manager.controller.service.AuditoriumService;
import com.cinema.manager.controller.service.BookingService;
import com.cinema.manager.controller.service.DiscountService;
import com.cinema.manager.controller.service.EventService;
import com.cinema.manager.controller.service.UserService;

public interface Controller {

	public UserService getUserService();
	public AuditoriumService getAuditoriumService();
	public EventService getEventService();
	public BookingService getBookingService();
	public DiscountService getDiscountService();

}
