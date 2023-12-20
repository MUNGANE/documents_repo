package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/SA.xml");
		Person p=(Person)context.getBean("person");
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());
		System.out.println(p.getFeesstructure());
		System.out.println("*************************************************************");
		Person p1=(Person)context.getBean("person2");
		System.out.println(p1);
		// TODO Auto-generated method stub

	}

}
