package com.model;

public class Project {
	private int id;
	private String name;
	private String manager;
	public Project(int id, String name, String manager) {
		super();
		this.id = id;
		this.name = name;
		this.manager = manager;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	
}
