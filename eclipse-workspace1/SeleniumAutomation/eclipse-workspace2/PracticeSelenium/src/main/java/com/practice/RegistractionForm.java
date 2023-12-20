package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistractionForm {
	
	private WebDriver webdriver;

	public RegistractionForm() {
		webdriver = new ChromeDriver();
	}
	
	public void openURL(String url) {
		 webdriver.get(url);
		
	}
	
	public void Register1() {
		webdriver.findElement(By.id(null))
	}

}
