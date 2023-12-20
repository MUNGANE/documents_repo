package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jalebi {
	//this is 3rd way to use init and destroy methode using annotations
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Jalebi(int price) {
		super();
		this.price = price;
	}

	public Jalebi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	
	public String toString() {
		return "Jalebi [price=" + price + "]";
	}
	//Note that both the @PostConstruct and @PreDestroy annotations are part of Java EE. Since Java EE was deprecated in Java 9, and removed in Java 11, we have to add an additional dependency to use these annotations
	@PostConstruct
	public void start() {
		System.out.println("starting jalebi making");
	}
	@PreDestroy   // if you run this progran it will not call this two methods because by default this annotation are disabled to make this enable go to config file
	public void end() {
		System.out.println("finished jalebi");
		
	}
	

}
