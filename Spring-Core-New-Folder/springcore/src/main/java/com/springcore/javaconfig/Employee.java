package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;

public class Employee {
	// you can create bean without using @component annotation
	//using bean annotation
	
	private Address add;
	
	public Employee(Address add) {
		super();
		this.add = add;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public void work() {
		add.city();
		System.out.println("employee is working");
		
	}

}
