package com.cinema.manager.controller.service;

import java.util.Map;

import com.cinema.manager.controller.dao.AuditoriumDao;
import com.cinema.manager.model.Auditorium;

public class AuditoriumServiceImpl implements AuditoriumService {

	private AuditoriumDao	auditoriumDao;

	public AuditoriumServiceImpl(AuditoriumDao auditoriumDao) {
		this.auditoriumDao = auditoriumDao;
	}

	public Map<String, Auditorium> getAuditoriums() {
		return auditoriumDao.getAuditoriums();
	};

	public Auditorium getAuditorium(String id) {
		return auditoriumDao.getAuditorium(id);
	};

	public int getSeatsNumber(String id) {
		return auditoriumDao.getSeatsNumber(id);
	};

	public String getVipSeats(String id) {
		return auditoriumDao.getVipSeats(id);
	};
}
