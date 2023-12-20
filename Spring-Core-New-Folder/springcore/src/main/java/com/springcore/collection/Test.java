package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
		Employee e1 =(Employee)context.getBean("Employee1");
		System.out.println(e1.getName());
		System.out.println(e1.getSkills());
		System.out.println(e1.getPhones());
		System.out.println(e1.getCourses());
		System.out.println(e1);
		System.out.println(e1.getCourses().getClass().getName());
		
		
		// TODO Auto-generated method stub

	}

}
