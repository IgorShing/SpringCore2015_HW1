package com.cinema.database.examples.koushik;

import com.cinema.database.examples.koushik.dao.JdbcDaoImpl;
import com.cinema.database.examples.koushik.model.Circle;

public class JDBCDemo {

	public static void main(String args[]) {
		JdbcDaoImpl jdbcDaoImpl = new JdbcDaoImpl();
		Circle circle = jdbcDaoImpl.getCircle(2);
		System.out.println(circle.getName());
	}

}
