package com.cinema.manager.controller.dao;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.cinema.manager.model.User;

public class UsersDaoMapImpl implements UsersDao {

	private Map<String, User>	users;

	public List<User> getAllUsers() {
		if (users == null) {
			return null;
		}
		List<User> userList = Collections.emptyList();
		users.values().addAll(userList);
		return userList;
	}

	public List<User> getUsersByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean createUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteUser(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
