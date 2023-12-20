package com.dailycodebuffer.UserService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.UserService.ValueObject.ResponseTemplate;
import com.dailycodebuffer.UserService.entity.ServiceEntity;
import com.dailycodebuffer.UserService.service.UserService;

@RestController("/users")
public class UserController {
	@Autowired
	private UserService userservice;
	
	@PostMapping("/")
	public ServiceEntity saveUser(@RequestBody ServiceEntity user) {
		return userservice.saveUser(user);
	}
	@GetMapping("/{id}")
	public ResponseTemplate getUserWithDepartment(@PathVariable("id")Long userId) {
		return userservice.getUserWithDepartment(userId);
		
	}

}
