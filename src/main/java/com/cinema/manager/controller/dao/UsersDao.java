package com.cinema.manager.controller.dao;

import java.util.List;

import com.cinema.manager.model.User;

public interface UsersDao {

	List<User> getAllUsers();

	List<User> getUsersByName(String name);

	/**
	 * Gets a user by Email
	 * @param email
	 * @return
	 */
	public User getUserByEmail(String email);

	boolean createUser(User user);

	User getUserById(String id);

	boolean deleteUser(String id);

	boolean updateUser(User user);
}
