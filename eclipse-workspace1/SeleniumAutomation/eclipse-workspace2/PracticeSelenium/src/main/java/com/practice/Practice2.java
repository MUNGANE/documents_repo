package com.practice;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(

	            "webdriver.chrome.driver",

	            "C:\\Users\\NMUNGANE\\eclipse-workspace2\\PracticeSelenium\\driver\\chromedriver.exe");
	
	RegistractionForm obj = new RegistractionForm();
	String url = "https://prowessapps.in/testing/register";
	obj.openURL(url);
    obj.Register1();
	}

}
