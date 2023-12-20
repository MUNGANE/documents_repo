package java8.features;

import java.util.List;

public class Employee {
	
	private String FName;
	private String LName;
	private double Salary;
	private List<String> projects;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String fName, String lName, double salary, List<String> projects) {
		super();
		FName = fName;
		LName = lName;
		Salary = salary;
		this.projects = projects;
	}
	
	@Override
	public String toString() {
		return "Employee [FName=" + FName + ", LName=" + LName + ", Salary=" + Salary + ", projects=" + projects + "]";
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	

}
