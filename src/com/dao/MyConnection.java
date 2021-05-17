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
			/*
			 * A singleton class is basically a class for which only one instance is allowed 
			 * to be created.
			 * Here whenever we will try to call this method twice to get connection object
			 * it will return same instance of Connection which was created before. 
			 * 
			 */
			if(con!=null) {
				return con;
			}
			
			/*
			 * loading of Driver class is automatically done via SPI
			 * in this mysql-connector version.
			 * The below code for loading using Class.forName()
			 * is just written for information.  
			 */
			
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
