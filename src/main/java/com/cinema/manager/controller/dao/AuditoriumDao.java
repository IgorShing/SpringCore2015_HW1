package com.cinema.manager.controller.dao;

import java.util.Map;

import com.cinema.manager.model.Auditorium;

public interface AuditoriumDao {

	Map<String, Auditorium> getAuditoriums();

	Auditorium getAuditorium(String id);

	int getSeatsNumber(String id);

	String getVipSeats(String id);
}
