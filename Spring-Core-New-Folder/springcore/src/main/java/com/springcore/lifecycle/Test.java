package com.springcore.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//container will call init and destroy methode automatically we dont need to call it. 
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/LC.xml");
		Samosa s1=(Samosa)context.getBean("samosa");
		System.out.println(s1);
		// TODO Auto-generated method stub
		//if u run this code destroy method will not call because to run destroy methode container need to use one methode 
		context.registerShutdownHook();//this methode is available in AbstractApplicationConbtext
		System.out.println("-----------------------------------------------");
		Pepsi p1= (Pepsi)context.getBean("pepsi");
		System.out.println(p1);
        System.out.println("------------------------------------------------");
        Jalebi j=(Jalebi)context.getBean("jalebi");
        System.out.println(j);
	}

}
