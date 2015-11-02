package com.cinema.manager;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cinema.manager.controller.Controller;

public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		Controller controller = (Controller) context.getBean("controller");

		System.out.println(controller.getUserService().getUsersByName("Anna")
				.size());

		System.out.println(controller.getUserService()
				.getUserByEmail("anna@gmail.com").getName());

		context.close();

		String str = RandomStringUtils.randomAlphabetic(10);
		System.out.println(str);
	}
}
