package com.cinema.manager.demo;

import java.util.List;

import com.cinema.manager.controller.Controller;
import com.cinema.manager.controller.service.BookingService;
import com.cinema.manager.model.Event;
import com.cinema.manager.model.Ticket;
import com.cinema.manager.model.User;

public class BookingServiceDemo implements Demo {

	private Controller controller;

	public BookingServiceDemo(Controller controller) {
		super();
		this.controller = controller;
	}

	public void execute() {

		BookingService bookingService = controller.getBookingService();

		System.out.println();
		System.out.println("************* BOOKING SERVICE DEMO ****************");

		Event event = controller.getEventService().getEvent(1);
		User user = controller.getUserService().getUser(4);
		Ticket ticket = controller.getTicketService().getTicket(3);
		List<Ticket> tickets = controller.getTicketService().getAllTickets();

		System.out.println("Show ticket price:");
		System.out.println(bookingService.getTicketPrice(event));

		bookingService.bookTicket(user, ticket);

		System.out.println("Show bookings booking a ticket:");
		System.out.println(bookingService.getAllBookings());

		System.out.println("Show tickets for an event:");
		System.out.println(bookingService.getTicketsForEvent(event));

		bookingService.create(4, tickets);
		bookingService.create(3, tickets);

		System.out.println("Delete booking id = 1:");
		bookingService.delete(1);
		System.out.println("Show bookings after deletion:");
		System.out.println(bookingService.getAllBookings());

		bookingService.update(2, 3, tickets);

		System.out.println("Show booking id = 1");
		System.out.println(bookingService.getBooking(1));

		System.out.println("Show all bookings");
		System.out.println(bookingService.getAllBookings());

	}

}
