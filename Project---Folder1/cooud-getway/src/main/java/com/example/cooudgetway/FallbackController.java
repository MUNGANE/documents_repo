package com.example.cooudgetway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	@GetMapping("/userServicefallback")
	public String UserServiceFallbackMethode() {
		return "User Service is down";
	}
	
	
		@GetMapping("/departmentServicefallback")
		public String DepartmentServiceFallbackMethode() {
			return "Depart Service is down";
		}

}
