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
public class DBConnection {

	private String	driverClassName;
	private String	url;
	private String	username;
	private String	password;

	/**
	 * 
	 */
	public DBConnection() {

		super();
		this.driverClassName = "org.postgresql.Driver";
		this.url = "jdbc:postgresql://localhost:5432/singletondb";

		this.password = "123456";
		this.username = "postgres";
	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName(this.driverClassName);

		return DriverManager.getConnection(this.url, this.username, this.password);
	}
}
