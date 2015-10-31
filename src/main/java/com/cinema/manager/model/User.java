package com.cinema.manager.model;

import java.text.ParseException;
import java.util.Date;
import java.util.Properties;

import com.cinema.manager.utils.DateConverterUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a user.
 *
 * @author Admin
 *
 */
public class User {

	@JsonProperty
	private String	   id;

	@JsonProperty
	private String	   name;

	@JsonProperty
	private String	   email;

	@JsonProperty
	private Date	   dateOfBirth;

	@JsonIgnore
	private Properties	properties;

	public User() {
	}

	public User(Properties properties) throws ParseException {
		this.id = properties.getProperty("id");
		this.name = properties.getProperty("name");
		this.email = properties.getProperty("email");
		this.dateOfBirth = DateConverterUtil.getSimpleDate(properties
		        .getProperty("dateOfBirth"));
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

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
		        + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
		        + ((properties == null) ? 0 : properties.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (properties == null) {
			if (other.properties != null)
				return false;
		} else if (!properties.equals(other.properties))
			return false;
		return true;
	}
}
