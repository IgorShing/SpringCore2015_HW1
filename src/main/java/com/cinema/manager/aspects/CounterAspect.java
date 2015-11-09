package com.cinema.manager.aspects;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import com.cinema.manager.model.Event;
import com.cinema.manager.model.Ticket;
import com.cinema.manager.model.User;

@Aspect
public class CounterAspect {

	private Map<String, Integer>	eventNameCallCounters	= new HashMap<String, Integer>();

	// Contains name of an eventId and number of getPrice calls
	private Map<Integer, Integer>	ticketPriceForEventCounters	= new HashMap<Integer, Integer>();

	public Map<String, Integer> getEventNameCallCounters() {
		return eventNameCallCounters;
	}

	public void setEventNameCallCounters(
			Map<String, Integer> eventNameCallCounters) {
		this.eventNameCallCounters = eventNameCallCounters;
	}

	public Map<Integer, Integer> getTicketPriceForEventCounters() {
		return ticketPriceForEventCounters;
	}

	public void setTicketPriceForEventCounters(
			Map<Integer, Integer> ticketPriceForEventCounters) {
		this.ticketPriceForEventCounters = ticketPriceForEventCounters;
	}

	@AfterReturning("getEventName() && getAllEventMethods()")
	public void getEventNameAdvice(JoinPoint joinPoint) {

		Object obj = joinPoint.getTarget();

		if (obj instanceof Event) {

			String eventName = ((Event) obj).getName();
			if (eventNameCallCounters.containsKey(eventName)) {
				eventNameCallCounters.put(eventName,
						eventNameCallCounters.get(eventName) + 1);
			} else {
				eventNameCallCounters.put(eventName, 1);
			}
		}
	}

	@AfterReturning("getPrice() && getAllTicketMethods()")
	public void getTicketPriceAdvice(JoinPoint joinPoint){
		Object obj = joinPoint.getTarget();

		if (obj instanceof Ticket)
		{
			Integer eventId = ((Ticket) obj).getEventId();
			if (ticketPriceForEventCounters.containsKey(eventId)) {
				ticketPriceForEventCounters.put(eventId,
						ticketPriceForEventCounters.get(eventId) + 1);
			} else {
				ticketPriceForEventCounters.put(eventId, 1);
			}
		}
	}

	@AfterReturning("bookTicket() && getAllBookingMethods()")
	public void bookingTicketAdvice(User user, Ticket ticket){

		System.out.println("+++++++++++++++++++++++++++++" + ticket.getPrice());

	}

	// Pointcuts for the getEventNameAdvice
	@Pointcut("execution(* getName())")
	public void getEventName() {
	}

	@Pointcut("within(com.cinema.manager.model.Event)")
	public void getAllEventMethods() {
	}

	// Pointcuts for the getTicketPriceAdvice
	@Pointcut("execution(* getPrice())")
	public void getPrice(){
	}

	@Pointcut("within(com.cinema.manager.model.Ticket)")
	public void getAllTicketMethods() {
	}

	// Pointcuts for booking tickets
	@Pointcut("args(user, ticket)")
	public void bookTicket(){
	}

	@Pointcut("within(com.cinema.manager.controller.service.BookingServiceImpl)")
	public void getAllBookingMethods(){
	}
}
