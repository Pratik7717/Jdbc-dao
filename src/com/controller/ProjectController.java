package com.controller;

import com.model.Project;
import com.dao.ProjectDao;

public class ProjectController {
	private static ProjectDao d;
	
	public void newProject(int id, String name, String manager) {
		Project p=new Project(id,name,manager);
//		System.out.println("Project id: " + p.getId() + " project name : " + p.getName());
		d=new ProjectDao();
		int i=d.insert(p);
		if(i>0) {
			System.out.println("New project has been added..\n");
		}
	}
	
	public void getAllProjects() {
		System.out.println("Get all projects in controller\n");
	}
	
	public void updateProject(int id) {
		System.out.println("Updated project with id " + id + "\n");
	}
	
	public void deleteProject(int id) {
		System.out.println("Deleted project with id : " + id + "\n");
	}
	
}
