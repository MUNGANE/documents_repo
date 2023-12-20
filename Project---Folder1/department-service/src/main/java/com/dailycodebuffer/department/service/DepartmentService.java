package com.dailycodebuffer.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repositary.DepartmentRepo;

import lombok.extern.slf4j.Slf4j;

@Service

public class DepartmentService {
	@Autowired
	private DepartmentRepo departmentrepo;

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		
		return departmentrepo.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		return departmentrepo.findByDepartmentId(departmentId);
	}

}
