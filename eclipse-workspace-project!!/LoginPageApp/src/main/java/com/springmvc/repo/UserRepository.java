package com.springmvc.repo;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.User;

@Repository
public class UserRepository {
	HibernateTemplate hibernateTemplate;
	public int saveUser(User user) {
		
		int i =(Integer)hibernateTemplate.save(user);
		return i;
		
	}
	
	public List<User> getUsers() {
		List<User> allUser=(List<User>)hibernateTemplate.loadAll(User.class);
		return allUser;
		
		
	}

}
