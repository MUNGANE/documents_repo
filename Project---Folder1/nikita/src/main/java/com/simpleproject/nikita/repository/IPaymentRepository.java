package com.simpleproject.nikita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.simpleproject.nikita.entity.Payments;




@Repository("Pr")
public interface IPaymentRepository  extends JpaRepository<Payments, Long>{
	

}
