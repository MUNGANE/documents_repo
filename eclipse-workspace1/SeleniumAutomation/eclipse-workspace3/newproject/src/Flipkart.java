import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipkart 
{

	public static void main(String[] args)
	{
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
		 driver.manage().window().maximize();
	        
		 driver.get("https://www.flipkart.com");
	        
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	        
		 driver.findElement(By.name("q")).sendKeys("MOBILE");
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);}}
