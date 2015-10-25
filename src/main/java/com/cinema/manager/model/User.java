package com.cinema.manager.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a user.
 *
 * @author Admin
 *
 */
public class User {

	@JsonProperty
	private String	id;

	@JsonProperty
	private String	name;

	@JsonProperty
	private String	email;

	@JsonProperty
	private Date	dateOfBirth;

	public User() {
	}

	public User(String id, String name, String email, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
