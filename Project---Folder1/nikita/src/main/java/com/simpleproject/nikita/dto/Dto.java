package com.simpleproject.nikita.dto;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
public class Dto {
	@Min(value=100,message="Id value should be greater than 100")
	private long paymentId;
	@NotNull(message="Null values are not allowed")
	private String method;
	@Min(value=0,message="Amount should be greater than or equal to zero")
	private double amountDue;
	private String accountName;
	public long getPaymentId() {
	return paymentId;
	}

}
