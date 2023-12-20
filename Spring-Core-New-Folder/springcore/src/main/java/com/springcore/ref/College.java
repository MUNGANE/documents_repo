package com.springcore.ref;

public class College {
   private String name;
   private Student std;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Student getStd() {
	return std;
}
public void setStd(Student std) {
	this.std = std;
}
public College(String name, Student std) {
	super();
	this.name = name;
	this.std = std;
}
public College() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "College [name=" + name + ", std=" + std + "]";
}
   
}
