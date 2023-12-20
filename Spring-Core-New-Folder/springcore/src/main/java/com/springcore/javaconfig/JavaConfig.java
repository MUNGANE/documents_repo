package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration    //to identify this is our configuration class
@ComponentScan(basePackages="com.springcore.javaconfig")  //in place of contect:comp-scan
public class JavaConfig {
	// you can use Bean annotation to create bean 
	// in this case we can skip @compscan annotation.
	
	
	@Bean   // so ioc container will get to know that i need to take object from this methode so i can provide if anyone ask
	public Employee getEmployee() {
		//creating new object
		Employee emp = new Employee(getAddress());
		return emp;
		
	}
	@Bean(name={"add1","add2","add3"})//you can mention multiple name otherwise it will take methode name(getaddress) as a name
	public Address getAddress() {
		return new Address();
	}

}
