package com.springcore.CI;

public class Person {
	private String name;
	private int Id;
	private Certi certi;
	public Person(String name, int id, Certi certi) {
		
		this.name = name;
		this.Id = id;
		this.certi=certi;
	}
	@Override
	public String toString() {
		return this.name+" : "+this.Id+"{"+this.certi.name+"}";
	}
	

}
