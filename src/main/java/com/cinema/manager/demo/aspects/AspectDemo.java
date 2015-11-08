package com.cinema.manager.demo.aspects;

import java.util.Date;

import com.cinema.manager.aspects.CounterAspect;
import com.cinema.manager.demo.Demo;
import com.cinema.manager.model.Event;
import com.cinema.manager.model.Ratings;

public class AspectDemo implements Demo {

	private CounterAspect	counterAspect;

	public AspectDemo(CounterAspect counterAspect) {
		this.counterAspect = counterAspect;
	}

	public void execute() {
		// Test Counter Aspect

		Event event = new Event(23, "qwrqwe", new Date(), Ratings.HIGH, 2356);
		event.getName();
		System.out.println(counterAspect.getEventNameCallCounters().toString());

	}

}
