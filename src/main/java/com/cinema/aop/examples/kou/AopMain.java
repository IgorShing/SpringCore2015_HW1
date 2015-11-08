package com.cinema.aop.examples.kou;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cinema.aop.examples.kou.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
		        "com/cinema/aop/examples/kou/spring-kou.xml");

		ShapeService shapeService = ctx.getBean("shapeService",
		        ShapeService.class);

		shapeService.getCircle().setName("Circle 2");
		System.out.println(shapeService.getCircle().getName());
		System.out.println(shapeService.getTriangle().getName());

	}

}
