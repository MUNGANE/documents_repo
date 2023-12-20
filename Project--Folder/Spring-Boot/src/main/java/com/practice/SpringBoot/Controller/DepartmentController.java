package com.practice.SpringBoot.Controller;


import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.SpringBoot.Entity.Department;
import com.practice.SpringBoot.Service.DepartmentService;

import antlr.collections.List;
import ch.qos.logback.classic.Logger;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentservice;
	
	private final Logger LOGGER = (Logger) LoggerFactory.getLogger( DepartmentController.class);
	
	@PostMapping("/departments")
	public Department saveDepartment( @Valid @RequestBody Department department) {
		LOGGER.info("Inside Savefeaprtment ");
		return departmentservice.saveDepartment(department);
		
	}
	@GetMapping("/departments")
	public List fetchDepartmentList(){
		LOGGER.info("inside fetch department");
		return departmentservice.fetchDepartmentList();
	}
	
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentservice.fetchDepartmentById(departmentId);
	}
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentId(@PathVariable("id") Long departmentId) {
		departmentservice.deleteDepartmentId(departmentId);
		return "Department deleted";
		
	}
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable("id")Long DepartmentId, @RequestBody Department department) {
		
		return departmentservice.updateDepartment(DepartmentId , department);
		
	}
	@GetMapping("/departments/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
		return departmentservice.fetchDepartmentByName(departmentName);
	}
	

}
