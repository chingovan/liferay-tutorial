/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chinv
 *
 */
public class DBSingletonConnectionTest {

	private static String	SELECT_QUERY	= "SELECT * FROM student";
	private static String	COUNT_QUERY		= "SELECT count(*) FROM student";

	private static void printAllRecord() {

		DBSingletonConnection dbSingletonConnection = DBSingletonConnection.getInstance();

		try {
			Connection connection = dbSingletonConnection.getConnection();

			Statement statement = connection.createStatement();

			ResultSet rs = null;
			int count = 0;
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

			if (statement != null) {
				rs = statement.executeQuery(SELECT_QUERY);
				while (rs.next()) {

					System.out.println("Code: " + rs.getString("code"));
					System.out.println("Name: " + rs.getString("name"));

					Date birthday = rs.getDate("birthday");
					System.out.println("Birthday: " + (birthday != null ? format.format(birthday) : ""));
					System.out.println("Gender: " + (rs.getBoolean("gender") == true ? "Nam" : "Nu"));
					System.out.println("=============================================");
				}
				statement.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void countAllRecord() {

		DBSingletonConnection dbSingletonConnection = DBSingletonConnection.getInstance();

		try {
			Connection connection = dbSingletonConnection.getConnection();

			Statement statement = connection.createStatement();

			ResultSet rs = null;
			int count = 0;

			if (statement != null) {
				rs = statement.executeQuery(COUNT_QUERY);
				if (rs.next()) {

					System.out.println("Number of record: " + rs.getInt(1));
				}
				statement.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		countAllRecord();

		printAllRecord();
	}

}
