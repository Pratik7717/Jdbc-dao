package com.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

import com.model.Project;

public class ProjectDao {
	private int i=0;
	
	public int insert(Project p) {
		Connection con = MyConnection.getConnection();
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into project values(?,?,?)");
			ps.setInt(1, p.getId());
			ps.setString(2, p.getName());
			ps.setString(3, p.getManager());
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in insertion " + e);
			e.printStackTrace();
		}
		
		return i;
	}
	
	
}
