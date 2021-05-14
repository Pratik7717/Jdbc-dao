package com.main;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1.New Project 2.Show All Projects 3.Update project 4.Delete Project");
			int choice=sc.nextInt();
			switch(choice) {
				case 1: 
					System.out.println("New project choice selected..");
					break;
			}
			
			System.out.print("Do you want to continue? y/n : ");
		}while(sc.next().equals("y"));

			
		sc.close();
		
		System.out.println("Thank you..");
	}

}
