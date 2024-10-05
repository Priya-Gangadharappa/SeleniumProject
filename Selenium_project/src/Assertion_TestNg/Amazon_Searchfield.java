package Assertion_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_Searchfield 
{
	WebDriver driver;
	@Test
	public void Search()
	{
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Amazon.in/");
	WebElement Signin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	Actions a1=new Actions(driver);
	a1.moveToElement(Signin);
	Signin.click();
	
	WebElement Username=driver.findElement(By.xpath("//input[@id='ap_email']"));
	Username.sendKeys("9872129519"+Keys.TAB);
	
	WebElement continuee=driver.findElement(By.xpath("//input[@id='continue']"));
	continuee.click();
	
	WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
	password.sendKeys("Bholenath@123"+Keys.TAB);
	
	WebElement SiginBtn=driver.findElement(By.xpath("//span[@id='auth-signin-button']"));
	SiginBtn.click();
	
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	Assert.assertTrue(e1.isDisplayed() && e1.isEnabled());
	
	
}
}
