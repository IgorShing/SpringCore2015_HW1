package com.cinema.manager.controller.dao;

import java.util.Map;

import com.cinema.manager.model.Auditorium;

public class AuditoriumDaoImpl implements AuditoriumDao {

	private Map<String, Auditorium>	auditoriums;

	public AuditoriumDaoImpl(Map<String, Auditorium> auditoriums) {
		this.auditoriums = auditoriums;
	}

	// TODO return a list here
	public Map<String, Auditorium> getAuditoriums() {
		return auditoriums;
	}

	public void setAuditoriums(Map<String, Auditorium> auditoriums) {
		this.auditoriums = auditoriums;
	}

	public Auditorium getAuditorium(String id) {
		if (auditoriums != null) {
			return auditoriums.get(id);
		}
		return null;
	}

	public int getSeatsNumber(String id) {
		if (auditoriums != null) {
			return auditoriums.get(id).getNumberOfSeats();
		}
		return -1;
	}

	public String getVipSeats(String id) {
		if (auditoriums != null) {
			return auditoriums.get(id).getVipSeats();
		}
		return null;
	}
}
