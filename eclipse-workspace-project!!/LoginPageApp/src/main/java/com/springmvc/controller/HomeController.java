package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.entity.User;
import com.springmvc.service.UserService;
@Controller
public class HomeController {
	@Autowired
	 private UserService userService;
	@RequestMapping("/login")
	public String homePage() {
		return "loginPage";
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String successForm(@ModelAttribute("userr") User user, Model model) {
		String m ="null";
		
		//this.userService.createUser(user);
		String message=userService.getAllUsers(user);
		if(message=="success") {
			 m= "successForm";
		}
		else {
			m="invalidForm";
		}
		return m;
	}

}
