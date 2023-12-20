package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while(go) {
		System.out.println("****Welcome to spring orm project****");
		
		System.out.println("PRESS 1 for add new student");
		System.out.println("PRESS 2 for display all student");
		System.out.println("PRESS 3 for delete  student");
		System.out.println("PRESS 4 for  update student");
		System.out.println("PRESS 5 for get details of student");
		System.out.println("PRESS 6 for exit");
		
		try {
			int input = Integer.parseInt(br.readLine());
			
			switch(input) {
			case 1:
				Student sd = new Student(3333,"Akash","Amaravati");
				int r=studentDao.insert(sd);
				System.out.println("student added "+r);
				break;
				
			case 2:
				List<Student> allstud=studentDao.getAllStudent();
				for(Student s:allstud) {
					System.out.println(s);
				}
				break;
				
			case 3:
				studentDao.deleteStudent(1234);
				System.out.println("student deleted");
				break;
			case 4:
				Student newStud= new Student(2222,"Ashwini","nashik");
				studentDao.updateStudent(newStud);
				System.out.println("updated");
				
				break;
			case 5:
				Student s =studentDao.getStudent(1111);
				System.out.println(s);
				break;
			case 6:
				System.out.println("Thank you for using me....visit again..!");
				go=false;
				break;
				
		
			}
			
			
			
		}
		catch(Exception e) {
			System.out.println("invalid input try another "+e.getMessage());
			
		}
		
		
		}

	}

}
 