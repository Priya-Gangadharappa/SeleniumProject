package Syncronization_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicit_wait1 
{
	WebDriver driver;
	@Test
	public void Wait()
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.Google.com");
	
	WebElement e1=driver.findElement(By.xpath("//textarea[@name='q']"));
	
	WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
	w1.until(ExpectedConditions.titleIs("Google"));
	//w1.until(ExpectedConditions.titleContains("Goog"));
	//w1.until(ExpectedConditions.alertIsPresent());
	e1.sendKeys("India"+Keys.ENTER);
}
}
