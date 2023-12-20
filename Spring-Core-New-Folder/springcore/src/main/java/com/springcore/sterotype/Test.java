package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	//without using <bean> you can create object of class by using @component annotation  

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/sterotype/sterotype.xml");
		//Student std=context.getBean("student",Student.class);//here we use name "student" because by default container will make bean of name "student"
		Student std=context.getBean("ob",Student.class);
		System.out.println(std);// in the output you will get null object because you did not specify value for value you can use @value annotation
		System.out.println(std.getCourses());		
		

	}

}
