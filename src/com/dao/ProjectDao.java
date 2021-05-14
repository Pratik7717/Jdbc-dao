package com.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

import com.model.Project;

public class ProjectDao {
	private int i=0;
	
	public int insert(Project p) {
		Connection con = MyConnection.getConnection();
		
		
		
		return i;
	}
	
	
}
