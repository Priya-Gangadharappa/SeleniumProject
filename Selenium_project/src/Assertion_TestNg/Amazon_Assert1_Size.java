package Assertion_TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_Assert1_Size 
{
	WebDriver driver;
@Test
public void Testcase() throws InterruptedException
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Amazon.in/");
	WebElement e1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	e1.sendKeys("shoe"+Keys.ENTER);	
	 List<WebElement> w2=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
	 Thread.sleep(1000);
	System.out.println(w2.size());
	
	Assert.assertTrue(w2.size()>1);
}
}
