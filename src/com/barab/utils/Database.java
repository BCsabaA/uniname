package com.barab.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	private static Connection connection;
	
	public Connection createConnection() {
		try {
			connection = DriverManager.getConnection("jdbc:ucanaccess://C://Users//barab//ws_eclipse_2023-06//uniname//db//uniname.accdb");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public Connection getCon() {
		return connection;
	}
	
	public void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
