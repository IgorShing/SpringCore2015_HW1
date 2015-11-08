package com.cinema.manager;

import java.util.Date;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cinema.manager.aspects.CounterAspect;
import com.cinema.manager.controller.Controller;
import com.cinema.manager.demo.Demo;
import com.cinema.manager.model.Event;
import com.cinema.manager.model.Ratings;

/**
 * Main application. Runs all demos.
 *
 * @author Igor_Shingaryov
 *
 */
public class App {

	List<Demo>	demoList;

	public App(List<Demo> demoList) {
		super();
		this.demoList = demoList;
	}

	public List<Demo> getDemoList() {
		return demoList;
	}

	public void setDemoList(List<Demo> demoList) {
		this.demoList = demoList;
	}

	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		App application = (App) context.getBean("application");

		for (Demo demo : application.getDemoList()) {
			demo.execute();
		}

		CounterAspect counterAspect = (CounterAspect) context
				.getBean("counterAspect");

		Event event = new Event(23, "qwrqwe", new Date(), Ratings.HIGH, 2356);
		event.getName();

		Controller controller = (Controller) context.getBean("controller");
		controller.getEventService().getEvent(4).getName();

		System.out.println(counterAspect.getEventNameCallCounters().toString());

		context.close();
	}
}
