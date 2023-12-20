package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		//here we are learning about scope of bean
		//there are 5 pre defined scope singlton/prototypr/request and sesssion(use for web application)/globalsession
		//here we will learn about singlton and prototypr
		//by default container use singletone scope
		//singletone means whenever you will ask container to provide you a object it will provide you same object everytime
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/sterotype/sterotype.xml");
		Student std=context.getBean("student",Student.class);
		System.out.println(std.hashCode());//1003292107
		Student std1=context.getBean("student",Student.class);
		System.out.println(std1.hashCode());//1003292107
		System.out.println("-----------------------------------------------------");
		
		//how to configure different scope
		//2 ways to configure 
		//using @scope annotation , it will always come with @component annotaion and now if you run this file ypou will get different hashcode means container has provided you different object every time
		//using xml - refer xml file and teacher class
		
		Teacher t=context.getBean("teacher",Teacher.class);
		System.out.println(t.hashCode());
		Teacher t1=context.getBean("teacher",Teacher.class);
		System.out.println(t1.hashCode());//you will get diff hashcode
		
		

	}

}
