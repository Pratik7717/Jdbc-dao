package com.controller;

import java.util.List;
import java.util.Iterator;

import com.model.Project;
import com.dao.ProjectDao;

public class ProjectController {
	private static ProjectDao d;
	
	static
	{
		d=new ProjectDao();
	}
	
	public void newProject(int id, String name, String manager) {
		Project p=new Project(id,name,manager);
//		System.out.println("Project id: " + p.getId() + " project name : " + p.getName());
		int i=d.insert(p);
		if(i>0) {
			System.out.println("New project has been added..\n");
		}
	}
	
	public void getAllProjects() {
//		System.out.println("Get all projects in controller\n");
		List<Project> ls=d.get();
		System.out.println("\nProjects added in the system : \n");
		
		System.out.println("Id" + "\t" + "Name" + "\t" + "ProjectManager");
		Iterator<Project> it=ls.iterator();
		while(it.hasNext()) {
			Project p=(Project) it.next();
			System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getManager() + "\t");
		}
		System.out.println();
	}
	
	public void updateProject(int id) {
		System.out.println("Updated project with id " + id + "\n");
	}
	
	public void deleteProject(int id) {
		System.out.println("Deleted project with id : " + id + "\n");
	}
	
}
