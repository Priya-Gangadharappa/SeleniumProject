package Selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_prog2 {

	public static void main(String[] args)
{
		ChromeDriver driver=new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("https://Amzon.in");
		  
		  driver.findElement(By.id("twotabsearchtextbox").name("field-keywords")).sendKeys("shoes");
		  
		  driver.findElement(By.id("twotabsearchtextbox").name("field-keywords")).sendKeys(Keys.ENTER);
		  
//driver.findElement(By.id("twotabsearchtextbox").name("field-keywords")).sendKeys("shoes"+Keys.ENTER);
	}

}
