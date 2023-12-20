package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		// you can also remove  xml file completely from project 
		//in place of xml file we need to create one configuration class
		
		
		
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student s= context.getBean("firstStudent",Student.class);
		System.out.println(s);
		s.study();
		System.out.println("----------------------------------------------------------");
		
		Address ad=context.getBean("add2",Address.class);
		System.out.println(ad);
		System.out.println("----------------------------------------------------------");
		Employee e=context.getBean("getEmployee",Employee.class);
		e.work();

	}

}
