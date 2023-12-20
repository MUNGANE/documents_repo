package com.simpleproject.nikita.entity;


import javax.persistence.Entity;

@Entity
//@Table(name="Payments")
public class Payments {
	private long paymentId;
	private String method;
	private double amountDue;
	private String accountName;
	public long getPaymentId() {
	return paymentId;

}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public double getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	
}
