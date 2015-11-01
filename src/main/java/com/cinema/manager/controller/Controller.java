package com.cinema.manager.controller;

import com.cinema.manager.controller.service.AuditoriumService;
import com.cinema.manager.controller.service.EventService;
import com.cinema.manager.controller.service.UserService;

public interface Controller {

	UserService getUserService();

	AuditoriumService getAuditoriumService();

	EventService getEventService();

}
