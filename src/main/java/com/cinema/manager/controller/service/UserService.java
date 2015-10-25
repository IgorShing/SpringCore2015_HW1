package com.cinema.manager.controller.service;

import java.util.List;

import com.cinema.manager.model.Ticket;
import com.cinema.manager.model.User;

public interface UserService {

	boolean register(User user);

	boolean removeUser(String userId);

	User getUserById(String userId);

	User getUserByEmail(String userEmail);

	List<User> getUsersByName(String name);

	List<Ticket> getBookedTickets(String userId);
}
