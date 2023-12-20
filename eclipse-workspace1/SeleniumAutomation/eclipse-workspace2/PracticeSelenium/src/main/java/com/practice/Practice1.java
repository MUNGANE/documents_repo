package com.practice;

public class Practice1 {
	public static void main(String[] args) {
		
		System.setProperty(

	            "webdriver.chrome.driver",

	            "C:\\Users\\NMUNGANE\\eclipse-workspace2\\PracticeSelenium\\driver\\chromedriver.exe");
	
	DriverInfo obj = new DriverInfo();
	String url = "https://www.google.com/";
	obj.openURL(url);
	obj.getInfo();
	obj.noOfHyperLink();
	
	
	
	

}}
