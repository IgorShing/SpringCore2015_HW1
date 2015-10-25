package com.cinema.manager.controller.service;

import java.util.List;

import com.cinema.manager.controller.dao.UsersDao;
import com.cinema.manager.model.Ticket;
import com.cinema.manager.model.User;

public class UserServiceImpl implements UserService {

	private UsersDao	usersDao;

	public UserServiceImpl(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeUser(String userId) {
		return usersDao.deleteUser(userId);
	}

	public User getUserById(String userId) {
		return usersDao.getUserById(userId);
	}

	public User getUserByEmail(String userEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUsersByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Ticket> getBookedTickets(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
