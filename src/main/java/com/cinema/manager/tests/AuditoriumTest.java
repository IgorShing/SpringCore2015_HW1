package com.cinema.manager.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cinema.manager.model.Auditorium;

public class AuditoriumTest {

	@Test
	public void auditoriumTest()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		Auditorium auditorium = (Auditorium) context.getBean("auditorium_1");

		assertEquals("Victory", auditorium.getName());
		assertEquals(100, auditorium.getNumberOfSeats());
		assertEquals("1,2,3,4,5,6,7,8,9,10", auditorium.getVipSeats());

		context.close();
	}
}
