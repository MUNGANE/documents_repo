package com.simpleproject.nikita.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpleproject.nikita.repository.IPaymentRepository;

@Service("PaymentServices")
 public class PaymentServiceImpl implements IPaymentService
{
@Autowired
IPaymentRepository paymentRepository;

}
