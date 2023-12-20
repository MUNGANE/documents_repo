package com.practice.SpringBoot.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.practice.SpringBoot.Entity.Department;
import com.practice.SpringBoot.Repository.DepartmentRepository;

@SpringBootTest
class DepartmentServiceTest {
	@Autowired
	private DepartmentService departmentService;
	@MockBean
	private DepartmentRepository departmentRepository;

	@BeforeEach
	void setUp(){
		Department department =   Department.builder()
				.departmentName("IT")
				.departmentAddredd("Pune")
				.departmentCode("IT-06")
				.departmentId(1L)
				.build();
		
		Mockito.when(departmentRepository.findByDepartmentName("IT")).thenReturn(department);
	}
	@Test
    public void whenValidDepartmentName_thenDepartmentShouldFind() {
    	
    	String departmentName = "IT";
    	Department found = departmentService.fetchDepartmentByName(departmentName);
    	assertEquals(departmentName, found.getDepartmentName());
		
	}
	

}
