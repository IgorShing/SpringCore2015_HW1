package com.cinema.manager.demo.aspects;

import com.cinema.manager.aspects.CounterAspect;
import com.cinema.manager.demo.Demo;

public class AspectDemo implements Demo {

	private CounterAspect	counterAspect;

	public AspectDemo(CounterAspect counterAspect) {
		this.counterAspect = counterAspect;
	}

	public void execute() {

		// Test Counter Aspect
		System.out.println("************** ASPECT DEMO ***************");

		System.out.println("Counters for call of Event.getName():");
		System.out.println(counterAspect.getEventNameCallCounters().toString());

		System.out.println("\nCounters for call of Ticket.getPrice() - EventId and Number of calls:");
		System.out.println(counterAspect.getTicketPriceForEventCounters().toString());
	}
}
