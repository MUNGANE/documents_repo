package com.simpleproject.nikita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.simpleproject.nikita.repository.IPaymentRepository;

@RestController
public class PaymentController {
	@Autowired
	IPaymentService paymentService;
	@Autowired
	IPaymentRepository pr;
	
	@GetMapping("/payments/{payId}")
	public PaymentDto getPaymentDetails(@PathVariable("payId") long id)
	{
	return paymentService.getPaymentDetails(id);
	}
	@GetMapping("/payments")
	public List<PaymentDto> getAllPayments()
	{
	return paymentService.getAllPayments();
	}

}
