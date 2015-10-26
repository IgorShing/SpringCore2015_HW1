package com.cinema.manager.controller.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.cinema.manager.model.User;
import com.cinema.manager.model.Users;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UsersDaoFileImpl implements UsersDao {

	private static ObjectMapper	mapper	= new ObjectMapper();
	private String	            fileName;
	private File	            file;
	private Users	            users;

	public UsersDaoFileImpl() {
	}

	public UsersDaoFileImpl(String fileName) {
		this.fileName = fileName;
	}

	public void init() throws IOException {
		this.file = new File(fileName);

		// Check if we can write in the file
		if (!file.exists() || !file.canRead()) {
			throw new IOException();
		}

		users = mapper.readValue(file, Users.class);
	}

	public void destroy() throws JsonProcessingException, IOException {
		// Check if we can write in the file
		if (file.exists() && file.canWrite()) {
			FileUtils.writeStringToFile(file, mapper.writeValueAsString(users),
					false);
		}
	}

	public List<User> getAllUsers() {
		if (users != null) {
			return users.getUsers();
		}
		return null;
	}

	public User getUserById(String id) {
		if (users == null) {
			return null;
		}

		for (User user : users.getUsers()) {
			if (user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}

	public User getUserByEmail(String email)
	{
		if (users == null) {
			return null;
		}

		for (User user : users.getUsers()) {
			if (user.getEmail().equals(email)) {
				return user;
			}
		}
		return null;
	}

	public boolean deleteUser(String id) {
		if (users == null) {
			return false;
		}

		for (User user : users.getUsers()) {
			if (user.getId().equals(id)) {
				users.getUsers().remove(user);
				return true;
			}
		}
		return false;
	}

	public boolean updateUser(User user) {
		if (users == null) {
			return false;
		}

		for (User item : users.getUsers()) {
			if (item.getId().equals(user.getId())) {
				users.getUsers().remove(item);
				users.getUsers().add(user);
				return true;
			}
		}
		return false;
	}

	public boolean createUser(User user) {
		if (user == null || users == null) {
			return false;
		}
		if (!users.getUsers().contains(user)) {
			users.getUsers().add(user);
		}
		return true;
	}

	public List<User> getUsersByName(String name)
	{
		if (users == null) {
			return null;
		}

		List<User> usersByName = new ArrayList<User>();

		for (User user : users.getUsers()) {
			if (user.getName().equals(name))
			{
				usersByName.add(user);
			}
		}
		return usersByName;
	};
}
