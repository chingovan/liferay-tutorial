/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author chinv
 *
 */
public class DBSingletonConnection {

	private static DBSingletonConnection	instance	= null;

	private Connection						connection	= null;

	/**
	 * 
	 */
	private DBSingletonConnection() {

		super();

		try {
			Class.forName("org.postgresql.Driver");

			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/singletondb", "postgres", "123456");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	/**
	 * @return the instance
	 */
	public static DBSingletonConnection getInstance() {

		try {
			if (instance == null || instance.getConnection().isClosed()) {

				instance = new DBSingletonConnection();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return instance;
	}

	/**
	 * @return the connection
	 */
	public Connection getConnection() {
		return connection;
	}
}
