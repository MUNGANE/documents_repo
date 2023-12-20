package com.student.manage;

public class Student {
	private String studentname;
	private String studentId;
	private String studentPhone;
	private String studentCity;
	public Student(String studentname, String studentId, String studentPhone, String studentCity) {
		super();
		this.studentname = studentname;
		this.studentId = studentId;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}
	public Student(String studentname, String studentPhone, String studentCity) {
		super();
		this.studentname = studentname;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", studentId=" + studentId + ", studentPhone=" + studentPhone
				+ ", studentCity=" + studentCity + "]";
	}
	
	

}
