package com.cinema.database.examples.koushik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cinema.database.examples.koushik.dao.JdbcDaoImpl;

public class JDBCDemo {

	public static void main(String args[]) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/cinema/database/examples/koushik/database.xml");
		JdbcDaoImpl jdbcDaoImpl = ctx.getBean("jdbcDaoImpl", JdbcDaoImpl.class);

		/*		Circle circle = jdbcDaoImpl.getCircle(2);
		System.out.println(circle.getName());

		System.out.println("Number of recoreds in figures: "
				+ jdbcDaoImpl.getCircleCount());

		System.out.println("The name of a circle with Id = 1: "
				+ jdbcDaoImpl.getCircleNameById(1));

		Circle circle2 = jdbcDaoImpl.getCircleById(3);

		System.out.println(circle2.toString());

		List<Circle> circles = jdbcDaoImpl.getAllCircles();
		System.out.println(circles.toString());
		 */
		jdbcDaoImpl.createPlainFiguresTable();



		// jdbcDaoImpl.insertCircle(new Circle(4, "Ellipse"));

	}

}
