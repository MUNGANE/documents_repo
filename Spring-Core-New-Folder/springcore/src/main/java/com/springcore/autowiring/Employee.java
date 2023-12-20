package com.springcore.autowiring;

public class Employee {
	private Address add;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		System.out.println("setter inje");
		this.add = add;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

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
