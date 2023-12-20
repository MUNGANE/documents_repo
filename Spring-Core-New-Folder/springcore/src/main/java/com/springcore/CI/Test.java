package com.springcore.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/CI/CIconfig.xml");
		Person p=(Person)context.getBean("person1");
		System.out.println(p);
		// TODO Auto-generated method stub
		Addition add = (Addition) context.getBean("addition");
		int sum= add.Sum();
		System.out.println(sum);

	}

}
