package com.spring.orm.dao;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.Student;

public class StudentDao {
	HibernateTemplate hibernateTemplate;
	//to add data
	@Transactional //this tag is require to perform write operation
	public int insert(Student student) {
		
		int i =(Integer)this.hibernateTemplate.save(student);
		return i;
		
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	//get single data
	public Student getStudent(int studId) {
		Student stud=this.hibernateTemplate.get(Student.class, studId);
		return stud;
	}
	
	//get all data
	public List<Student> getAllStudent(){
		List<Student> allStud=this.hibernateTemplate.loadAll(Student.class);
		return allStud;
	}
	
	//delete row
	@Transactional
	public void deleteStudent(int studId) {
		Student stud=this.hibernateTemplate.get(Student.class, studId);
		this.hibernateTemplate.delete(stud);
	}
	
	//update data
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}
	

}
