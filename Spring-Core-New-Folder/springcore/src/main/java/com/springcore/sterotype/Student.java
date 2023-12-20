package com.springcore.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob") //you can forcfully create bean of any name 
@Scope("prototype")
public class Student {
	@Value("Nikita")
	private String studentNane;
	@Value("Achalpur")
	private String City;
	@Value("12")
	private int percentage;
	//lets see how to add collection values
	@Value("#{course}")
	private List<String> courses;
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public String getStudentNane() {
		return studentNane;
	}
	public void setStudentNane(String studentNane) {
		this.studentNane = studentNane;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Student [studentNane=" + studentNane + ", City=" + City + ", percentage=" + percentage + ", courses="
				+ courses + "]";
	}
	
	

}
