package com.cinema.manager.controller.service;

import java.util.List;

import com.cinema.manager.controller.service.logic.DiscountStrategy;
import com.cinema.manager.model.Event;
import com.cinema.manager.model.User;

public class DiscountServiceImpl implements DiscountService {

	private List<DiscountStrategy>	discountStrategy;

	public DiscountServiceImpl(List<DiscountStrategy> discountStrategy) {
		this.discountStrategy = discountStrategy;
	}

	public float getDiscount(User user, Event event) {
		// TODO Auto-generated method stub
		return 0;
	}

}
