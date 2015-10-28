package com.cinema.manager.controller.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.cinema.manager.model.User;

public class UsersDaoMapImpl implements UsersDao {

	private Map<String, User>	users;

	public UsersDaoMapImpl(Map<String, User> users) {
		super();
		this.users = users;
	}

	public List<User> getAllUsers() {
		if (users == null) {
			return null;
		}
		List<User> userList = Collections.emptyList();
		users.values().addAll(userList);
		return userList;
	}

	public List<User> getUsersByName(String name) {
		if (users != null && name != null)
		{
			User user;
			List<User> userList = new ArrayList<User>();
			for (Map.Entry<String, User> entry : users.entrySet())
			{
				user = entry.getValue();
				if (name.equals(user.getName()))
				{
					userList.add(user);
				}
			}
			return userList;
		}
		return null;
	}

	public User getUserByEmail(String email) {
		if (users != null && email != null)
		{
			User user;
			for (Map.Entry<String, User> entry : users.entrySet())
			{
				user = entry.getValue();
				if (email.equals(user.getEmail()))
				{
					return user;
				}
			}
		}
		return null;
	}

	public boolean createUser(User user) {
		if (users != null && !users.containsValue(user))
		{
			users.put(user.getId(), user);
			return true;
		}
		return false;
	}

	public User getUserById(String id) {
		if (users != null)
		{
			return users.get(id);
		}
		return null;
	}

	public boolean deleteUser(String id) {
		if (users.remove(id) != null)
		{
			return true;
		};
		return false;
	}

	public boolean updateUser(User user) {
		if (users != null)
		{
			users.put(user.getId(), user);
			return true;
		}
		return false;
	}

}
