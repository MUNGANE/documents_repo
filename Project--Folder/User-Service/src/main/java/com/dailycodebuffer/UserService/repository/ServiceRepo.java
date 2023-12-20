package com.dailycodebuffer.UserService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.UserService.entity.ServiceEntity;
@Repository
public interface ServiceRepo extends JpaRepository<ServiceEntity, Long>{

	ServiceEntity findByUserId(Long userId);

}
