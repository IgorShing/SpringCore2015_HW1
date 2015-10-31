package com.cinema.manager.model;

import java.util.Properties;

public class Auditorium {

	private Properties	properties;

	private String	   name;
	private int	       numberOfSeats;
	private String	   vipSeats;

	public Auditorium() {
	}

	public Auditorium(Properties properties) {
		this.properties = properties;
		init();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		properties.setProperty("name", name);
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
		properties.setProperty("numberOfSeats", String.valueOf(numberOfSeats));
	}

	public String getVipSeats() {
		return vipSeats;
	}

	public void setVipSeats(String vipSeats) {
		this.vipSeats = vipSeats;
		properties.setProperty("vipSeats", vipSeats);
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
		init();
	}

	private void init() {
		this.name = properties.getProperty("name");
		this.numberOfSeats = Integer.parseInt(properties
				.getProperty("numberOfSeats"));
		this.vipSeats = properties.getProperty("vipSeats");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfSeats;
		result = prime * result
				+ ((properties == null) ? 0 : properties.hashCode());
		result = prime * result
				+ ((vipSeats == null) ? 0 : vipSeats.hashCode());
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
		Auditorium other = (Auditorium) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfSeats != other.numberOfSeats)
			return false;
		if (properties == null) {
			if (other.properties != null)
				return false;
		} else if (!properties.equals(other.properties))
			return false;
		if (vipSeats == null) {
			if (other.vipSeats != null)
				return false;
		} else if (!vipSeats.equals(other.vipSeats))
			return false;
		return true;
	}

}
