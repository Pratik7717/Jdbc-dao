package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	private static String url="jdbc:mysql://localhost:3306/jdbc";
	private static String user="root";
	private static String password="password";
	
	private static Connection con=null;
	
	public static Connection getConnection() { 

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("Exception in connection..unable to procees" + e);
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			System.out.println("Exception in connection..unable to procees" + e);
			e.printStackTrace();
		}
		System.out.println("Connected to database..");
		
		return con;
	}
}
