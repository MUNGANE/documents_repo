package com.springcore.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		//this is using annotation	
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/autowiring/annotation/autowiring.xml");
		Employee e1=context.getBean("emp",Employee.class);
		System.out.println(e1);
		

	}

}
