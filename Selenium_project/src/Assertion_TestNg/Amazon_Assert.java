package Assertion_TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_Assert 
{
	WebDriver driver;
@Test
public void Testcase()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Amazon.in/");
	WebElement e1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	e1.sendKeys("mobiles"+Keys.ENTER);
	Assert.assertTrue(false);
}
}
