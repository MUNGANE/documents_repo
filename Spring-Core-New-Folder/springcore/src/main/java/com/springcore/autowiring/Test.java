package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	// Autowiring -- automatic wiring - container will automatically inject object of 1 class to another
	//till now we did it mannually using ref 
	//2 type of autowiring -- using xml , using annotation
	//advantage- automatic and reduce code
	//dis-ad --- no control of program as it is automatic and can only use for obj ref not for premitive data type(int,string)

	public static void main(String[] args) {
		//this is example of autowiing using xml 
		//5 type- using 1.no(this is default means autowiring will be disabled),2.byname,3.byType,4.constructore and 5.
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/autowiring/autowiring.xml");
		Employee e1=context.getBean("emp",Employee.class);
		System.out.println(e1);
		Employee e2=context.getBean("emp1",Employee.class);
		System.out.println(e2);
		Employee e3=context.getBean("emp2",Employee.class);
		System.out.println(e3);
		// TODO Auto-generated method stub

	}

}
