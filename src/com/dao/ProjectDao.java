package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import java.util.LinkedList;

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
	
	
	public List<Project> get() {
		Connection con = MyConnection.getConnection();
		String query="select * from project";
		ResultSet rs=null;
		List<Project> ls=null;
		try {
			Statement st=con.createStatement();
			rs=st.executeQuery(query);
			ls=new LinkedList<>();
			while(rs.next()) {
				ls.add(new Project(rs.getInt("id"),rs.getString(2),rs.getString(3)));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in get() " + e);
			e.printStackTrace();
		}
	
		return ls;
	}
	
	
}
