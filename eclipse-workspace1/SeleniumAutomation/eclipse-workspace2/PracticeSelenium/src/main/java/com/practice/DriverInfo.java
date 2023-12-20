package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInfo {
	
	private WebDriver webdriver;

	public DriverInfo() {
		webdriver = new ChromeDriver();
	}
	
	public void openURL(String url) {
		 webdriver.get(url);
		
	}
	
	public void getInfo() {
		System.out.println(webdriver.getCurrentUrl());
		System.out.println(webdriver.getTitle());
	}
	
	public void noOfHyperLink() {
		List<WebElement> links = webdriver.findElements(By.tagName("a"));

	    System.out.println("Total number of anchor tags in the whole page:" + links.size());

	    webdriver.close();
	}
	

}
