package com.springcore.autowiring;

public class Address {
	private String area;
	private String city;
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		System.out.println("inside addres setter");
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("inside addres setter");
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + "]";
	}
	
	

}
