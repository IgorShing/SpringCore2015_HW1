package com.cinema.manager.controller.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.cinema.manager.model.Auditorium;
import com.cinema.manager.utils.RandomGenerator;

public class AuditoriumDaoImpl2 implements AuditoriumDao {

	private static final int	    ID_LENGTH	            = 10;
	private static final int	    ATTEMPTS_TO_GENERATE_ID	= 10;
	private static final String	    ID_GENERATING_ERROR	    = "Unable to generate id for the event.";

	private Map<String, Auditorium>	auditoriums	            = new HashMap<String, Auditorium>();

	public AuditoriumDaoImpl2(List<Properties> auditoriumProps)
			throws Exception {
		String name;
		int numberOfSeats;
		String vipSeats;

		for (Properties props : auditoriumProps) {
			name = props.getProperty("name");
			numberOfSeats = Integer
					.parseInt(props.getProperty("numberOfSeats"));
			vipSeats = props.getProperty("vipSeats");

			String id = generateAuditoriumId();
			Auditorium auditorium = new Auditorium(id, name, numberOfSeats,
			        vipSeats);
			auditoriums.put(id, auditorium);
		}
	}

	public Map<String, Auditorium> getAuditoriums() {
		return auditoriums;
	}

	public Auditorium getAuditorium(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getSeatsNumber(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getVipSeats(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Generates an id for an auditorium.
	 *
	 * @return
	 */
	private String generateAuditoriumId() throws Exception {
		Set<String> auditoriumIds = auditoriums.keySet();
		String newId = RandomGenerator.generateRandomString(ID_LENGTH);

		if (auditoriumIds.isEmpty()) {
			return newId;
		}

		int counter = 1;

		while (auditoriumIds.contains(newId)
				&& counter++ < ATTEMPTS_TO_GENERATE_ID) {
			newId = RandomGenerator.generateRandomString(ID_LENGTH);
		}

		if (counter >= ATTEMPTS_TO_GENERATE_ID) {
			throw new Exception(ID_GENERATING_ERROR);
		}
		return newId;
	}
}
