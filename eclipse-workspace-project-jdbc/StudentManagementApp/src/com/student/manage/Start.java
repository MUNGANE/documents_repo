package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcome to student management App");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("PRESS 1 to ADD student");
			System.out.println("PRESS 2 to DELETE student");
			System.out.println("PRESS 3 to DISPLAY student");
			System.out.println("PRESS 4 to EXIT student");
			
			int c=Integer.parseInt(br.readLine());
			
			if(c==1) {
				System.out.println("Enter user name");
				String name=br.readLine();
				
				System.out.println("Enter user phone");
				String phone=br.readLine();
				
				System.out.println("Enter user city");
				String city=br.readLine();
				
				//create student object to store new student
				Student st=new Student(name,phone,city);
				boolean ans=StudentDao.insertStudentToDB(st);
				if(ans) {
					System.out.println("student added");
				}
				else {
					System.out.println("try again1");
				}
				System.out.println(st);
				
			}else if(c==2)
			{
				System.out.println("Enter student id to delete: ");
				int userId= Integer.parseInt(br.readLine());
				boolean b=StudentDao.deleteStudent(userId);
				if(b) {
					System.out.println("deleted");
				}
				else {
					System.out.println("try again");
				}
				
			}else if(c==3)
			{
				StudentDao.showAllStudent();
				
			}
			else {
				
			}
			
			System.out.println("Thank you.....!!");
			}
		
		

	}
}
	
	
	


