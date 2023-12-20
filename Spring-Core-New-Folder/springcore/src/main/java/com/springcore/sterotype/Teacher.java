package com.springcore.sterotype;

import java.util.List;

public class Teacher {
	private String name;
	private List<String> classes;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getClasses() {
		return classes;
	}
	public void setClasses(List<String> classes) {
		this.classes = classes;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", classes=" + classes + "]";
	}
	
	

}
