package com.cinema.manager.model;

import java.util.Properties;

public class Auditorium {

	private Properties properties;

	private String name;
	private int numberOfSeats;
	private String vipSeats;

	public Auditorium() {
	}

	public Auditorium(Properties properties) {
		this.name = properties.getProperty("name");
		this.numberOfSeats = Integer.parseInt(properties.getProperty("numberOfSeats"));
		this.vipSeats = properties.getProperty("vipSeats");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getVipSeats() {
		return vipSeats;
	}

	public void setVipSeats(String vipSeats) {
		this.vipSeats = vipSeats;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
