package com.cinema.manager.controller;

import com.cinema.manager.controller.service.AuditoriumService;
import com.cinema.manager.controller.service.EventService;
import com.cinema.manager.controller.service.UserService;

public class ControllerImpl implements Controller {

	private UserService	      userService;
	private AuditoriumService	auditoriumService;
	private EventService	  eventService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public AuditoriumService getAuditoriumService() {
		return auditoriumService;
	}

	public void setAuditoriumService(AuditoriumService auditoriumService) {
		this.auditoriumService = auditoriumService;
	}

	public EventService getEventService() {
		return eventService;
	}

	public void setEventService(EventService eventService) {
		this.eventService = eventService;
	}
}
