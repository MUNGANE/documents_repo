package com.dailycodebuffer.UserService.ValueObject;

import com.dailycodebuffer.UserService.entity.ServiceEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate {
   private ServiceEntity user;
   private Department department;
public void setUser(ServiceEntity user2) {
	// TODO Auto-generated method stub
	
}
public void setDepartment(Department department2) {
	// TODO Auto-generated method stub
	
}
}
