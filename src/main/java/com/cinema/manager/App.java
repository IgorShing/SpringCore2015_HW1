package com.cinema.manager;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cinema.manager.controller.Controller;

public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
		        "spring.xml");

		Controller controller = (Controller) context.getBean("controller");

		System.out.println(controller.getUserService().getUserById("2")
				.getName());
		controller.getUserService().removeUser("3");

		context.close();
	}
}
