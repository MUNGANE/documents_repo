package com.practice.SpringBoot.Service;

import org.springframework.stereotype.Service;

import com.practice.SpringBoot.Entity.Department;

import antlr.collections.List;

@Service
public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List fetchDepartmentList();

	
	public void deleteDepartmentId(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	public Department fetchDepartmentByName(String departmentName);

	Department fetchDepartmentById(Long departmentId);

}
