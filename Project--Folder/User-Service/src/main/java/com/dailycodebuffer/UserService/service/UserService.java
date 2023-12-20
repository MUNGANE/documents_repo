package com.dailycodebuffer.UserService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dailycodebuffer.UserService.ValueObject.Department;
import com.dailycodebuffer.UserService.ValueObject.ResponseTemplate;
import com.dailycodebuffer.UserService.entity.ServiceEntity;
import com.dailycodebuffer.UserService.repository.ServiceRepo;

@Service
public class UserService {
	@Autowired
	private ServiceRepo servicerepo;
	@Autowired
	private RestTemplate restTemplate;
	
    public ServiceEntity saveUser(ServiceEntity user) {
    	
    	
		return servicerepo.save(user);
    	
    	
    }

	public ResponseTemplate getUserWithDepartment(Long userId) {
		ResponseTemplate responsetemplate = new ResponseTemplate();
		ServiceEntity user = servicerepo.findByUserId(userId);
		
		
		Department department = restTemplate.getForObject("http://localhot:9001/departments/" +user.getdepartmentId(), Department.class);
		responsetemplate.setUser(user);
		responsetemplate.setDepartment(department);
		return responsetemplate;
	}
}
