package com.cinema.manager.controller.service.logic;

import java.util.Date;
import java.util.List;

import com.cinema.manager.model.Ticket;
import com.cinema.manager.model.User;


public class BirthdayStrategy implements DiscountStrategy {

	public int discount(User user, List<Ticket> tickets) {
		Date today = new Date();
		double totalDiscount = 0.0;

		if (user.getDateOfBirth().equals(today))
		{
			for (Ticket ticket : tickets){
				totalDiscount += 0.05*ticket.getPrice();
			}
		}
		return (int) totalDiscount;
	}
}