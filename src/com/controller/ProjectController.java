package com.controller;

import com.model.Project;

public class ProjectController {
	
	public void newProject(int id, String name, String manager) {
		Project p=new Project(id,name,manager);
		System.out.println("Project id: " + p.getId() + " project name : " + p.getName());
	}
	
	public void getAllProjects() {
		System.out.println("Get all projects in controller");
	}
	
	public void updateProject(int id) {
		System.out.println("Updated project with id " + id);
	}
	
	public void deleteProject(int id) {
		System.out.println("Deleted project with id : " + id);
	}
	
}
