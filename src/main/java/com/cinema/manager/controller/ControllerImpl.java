package com.cinema.manager.controller;

import com.cinema.manager.controller.service.UserService;

public class ControllerImpl implements Controller {

	private UserService	userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
