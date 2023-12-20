package com.practice.SpringBoot.Service;


import java.util.Objects;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.SpringBoot.Entity.Department;
import com.practice.SpringBoot.Repository.DepartmentRepository;


import antlr.collections.List;

@Service
public class DepartmentServiceImp implements DepartmentService{
	@Autowired
     private DepartmentRepository departmentRepository;
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}
	@Override
	public List fetchDepartmentList() {
		// TODO Auto-generated method stub
		return (List) departmentRepository.findAll();
	}
	@Override
	public Department fetchDepartmentById(Long departmentId)  {
		
		// TODO Auto-generated method stub
		
		return departmentRepository.findByDepartmentId(departmentId);
	}
	@Override
	public void deleteDepartmentId(Long departmentId) {
		// TODO Auto-generated method stub
		departmentRepository.deleteById(departmentId);
		
	}
	@Override
	public Department updateDepartment(Long departmentId, Department department) {
		// TODO Auto-generated method stub
		Department DB = departmentRepository.findById(departmentId).get();
		
		if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			DB.setDepartmentName(department.getDepartmentName());
		}
		
		if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
			DB.setDepartmentCode(department.getDepartmentCode());
		}
		
		if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
			DB.setDepartmentAddress(department.getDepartmentAddress());
		}
		
		return departmentRepository.save(DB);
	}
	@Override
	public Department fetchDepartmentByName(String departmentName) {
		// TODO Auto-generated method stub
		return departmentRepository.findByDepartmentName(departmentName);
	}
	

}
