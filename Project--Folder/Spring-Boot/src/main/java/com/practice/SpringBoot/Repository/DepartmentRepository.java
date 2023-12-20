package com.practice.SpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.SpringBoot.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department , Long>{
	//we are creating this methode here because its not there in JPA already....
	public Department findByDepartmentName(String departmentname);

	public Department findByDEpartmentId(Long departmentId);

	public Department findByDepartmentId(Long departmentId);
	
	//to avoid naming convention use = findByDepartmentNameIgnoreCase

}
