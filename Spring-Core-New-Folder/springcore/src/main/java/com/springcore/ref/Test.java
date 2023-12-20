package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/ref.xml");
		College c=(College)context.getBean("college1");
		System.out.println(c.getStd().getId());
		System.out.println(c);
		
		
		// TODO Auto-generated method stub

	}

}
