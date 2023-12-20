package com.capgemini.selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestGoogleSearch {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		//load google in the browser
		
		driver.get("https://www.google.com/");
		WebElement searchbox= driver.findElement(By.name("q"));
		
		searchbox.sendKeys("Selenium Automation Framework");
		System.out.println(driver.getTitle());
		
		searchbox.submit();
		
		System.out.println(driver.getTitle());
	}


	}


