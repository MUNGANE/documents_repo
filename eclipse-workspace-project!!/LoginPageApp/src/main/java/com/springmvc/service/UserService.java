package com.springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springmvc.entity.User;
import com.springmvc.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	@Transactional
	public int createUser(User user) {
		
		return this.userRepository.saveUser(user);
		
	}
	
	public String getAllUsers(@ModelAttribute("user") User user){
		String s="null";
		List<User> allUsers= this.userRepository.getUsers();
		
	   for (User u : allUsers) {
		   if(u.getUsername()==user.getUsername()) {
			   if(u.getPassword()==user.getPassword()) {
				   s= "success";
			   }
			   else {
				   s="incorrect pass";
			   }
		   }
		   else {
			   s= "Invalid user";
		   }
	}
	   return s;
	}

}
