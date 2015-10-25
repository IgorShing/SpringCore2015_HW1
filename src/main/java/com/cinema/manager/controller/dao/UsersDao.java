package com.cinema.manager.controller.dao;

import java.util.List;

import com.cinema.manager.model.User;

public interface UsersDao {

	List<User> getAllUsers();

	boolean createUser(User user);

	User getUserById(String id);

	boolean deleteUser(String id);

	boolean updateUser(User user);
}
