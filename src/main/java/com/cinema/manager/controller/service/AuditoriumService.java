package com.cinema.manager.controller.service;

import java.util.Map;

import com.cinema.manager.model.Auditorium;

public interface AuditoriumService {

	Map<String, Auditorium> getAuditoriums();

	Auditorium getAuditorium(String id);

	int getSeatsNumber(String id);

	String getVipSeats(String id);
}
