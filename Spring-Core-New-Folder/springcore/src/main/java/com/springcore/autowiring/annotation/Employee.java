package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("add1") // if there are two beans then you can specify bean name by default it will take 1st bean
	private Address add;

	public Address getAdd() {
		return add;
	}
    //you can use autowire annotation here as well to use setter inje
	public void setAdd(Address add) {
		System.out.println("setter inje");
		this.add = add;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
    //ou can use autowire annotation here as well to use constructore inje
	public Employee(Address add) {
		
		super();
		System.out.println("const inj");
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [add=" + add + "]";
	}
	

}
