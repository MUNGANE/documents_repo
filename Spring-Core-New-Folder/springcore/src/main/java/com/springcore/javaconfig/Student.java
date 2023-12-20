package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("firstStudent")
public class Student {
	public void study() {
		System.out.println("Studnet is reading......!");
	}

}
