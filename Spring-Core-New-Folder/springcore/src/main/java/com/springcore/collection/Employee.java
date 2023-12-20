package com.springcore.collection;

import java.util.List;

import java.util.Map;
import java.util.Set;

public class Employee {
	private String name;
	private List<String> skills;
	private Set<String>  phones;
	private Map<String , String> courses;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", skills=" + skills + ", phones=" + phones + ", courses=" + courses + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, List<String> skills, Set<String> phones, Map<String, String> courses) {
		super();
		this.name = name;
		this.skills = skills;
		this.phones = phones;
		this.courses = courses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Set<String> getPhones() {
		return phones;
	}
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	

}
