package com.controller;

import com.model.Project;

public class ProjectController {
	
	public void newProject(int id, String name, String manager) {
		Project p=new Project(id,name,manager);
		System.out.println("Project id: " + p.getId() + " project name : " + p.getName());
	}
	
}
