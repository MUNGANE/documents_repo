package com.dailycodebuffer.UserService.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String firstname;
	private String lastname;
	private String email;
	private Long departmentId;
	public String getdepartmentId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
