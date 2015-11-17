package com.cinema.database.examples.koushik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cinema.database.examples.koushik.dao.JdbcDaoImpl;
import com.cinema.database.examples.koushik.model.Circle;

public class JDBCDemo {

	public static void main(String args[]) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
		        "com/cinema/database/examples/koushik/database.xml");
		JdbcDaoImpl jdbcDaoImpl = ctx.getBean("jdbcDaoImpl", JdbcDaoImpl.class);

		Circle circle = jdbcDaoImpl.getCircle(2);
		System.out.println(circle.getName());
	}

}
