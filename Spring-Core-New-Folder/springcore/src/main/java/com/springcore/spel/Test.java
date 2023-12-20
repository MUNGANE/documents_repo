package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//SpEL - Spring Expression language
		//it support parsing and executing expression with help of @Value annotaion
		//there are another way also but most commonly we use with help of @Value annotation 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spel.xml");
		Demo d1=context.getBean("demo",Demo.class);
		System.out.println(d1);
		
	}

}
