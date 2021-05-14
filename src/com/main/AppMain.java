package com.main;

import java.util.Scanner;

import com.controller.ProjectController;

public class AppMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ProjectController controller=new ProjectController();
		
		do {
			System.out.println("1.New Project 2.Show All Projects 3.Update project 4.Delete Project");
			int choice=sc.nextInt();
			switch(choice) {
				case 1: 
//					System.out.println("New project choice selected..");
					System.out.println("Enter id, project name, project manager : ");
					controller.newProject(sc.nextInt(),sc.next(),sc.next());
					
					break;
					
				case 2:
					System.out.println("Show all projects");
					break;
					
				case 3:
					System.out.println("Update project");
					break;
					
				case 4:
					System.out.println("Delete project");
					break;
					
				default: 
					System.out.println("Wrong choice..");
			}
			
			System.out.print("Do you want to continue? y/n : ");
		}while(sc.next().equals("y"));

			
		sc.close();
		
		System.out.println("Thank you..");
	}

}
