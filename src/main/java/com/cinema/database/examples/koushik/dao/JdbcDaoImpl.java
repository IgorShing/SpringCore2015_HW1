package com.cinema.database.examples.koushik.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cinema.database.examples.koushik.model.Circle;

@Component
public class JdbcDaoImpl {

	private Connection	      connect;
	private Statement	      statement;
	private PreparedStatement	preparedStatement;
	private ResultSet	      resultSet;

	private JdbcTemplate	  jdbcTemplate	= new JdbcTemplate();

	public Circle getCircle(int circleId) {

		Circle circle = null;
		try {
			// Setup the connection with the DB
			connect = jdbcTemplate.getDataSource().getConnection();

			preparedStatement = connect
			        .prepareStatement("SELECT * FROM figures.figures WHERE id = ?");

			// Initialize the parameter value
			preparedStatement.setInt(1, circleId);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				circle = new Circle(circleId, resultSet.getString("name"));
			}

		} catch (Exception e) {
			throw new RuntimeException();
		} finally {
			close();
		}

		return circle;
	}

	/**
	 * Returns a number circles.
	 *
	 * @return
	 */
	public int getCircleCount() {
		String sql = "SELECT Count(*) FROM Figures";
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}

	private void writeResultSet(ResultSet resultSet) throws SQLException {

		// ResultSet is initially before the first data set
		while (resultSet.next()) {
			// It is possible to get the columns via name
			// also possible to get the columns via the column number
			// which starts at 1
			// e.g. resultSet.getSTring(2);
			String id = resultSet.getString("id");
			String name = resultSet.getString("name");

			System.out.println("Id: " + id);
			System.out.println("Name: " + name);
		}
	}

	// You need to close the resultSet
	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {
		}
	}

	public DataSource getDataSource() {
		return jdbcTemplate.getDataSource();
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
}
