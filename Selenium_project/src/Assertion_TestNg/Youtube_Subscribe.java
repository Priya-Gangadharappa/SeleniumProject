package Assertion_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Youtube_Subscribe 
{
	WebDriver driver;
@Test
public void Subscribe()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
	search.sendKeys("Grotechminds"+Keys.ENTER);
	
	WebElement sub=driver.findElement(By.xpath("//div[@class='yt-spec-touch-feedback-shape__fill']"));
	sub.click();
	driver.switchTo().window("sub");
	
	WebElement email=driver.findElement(By.xpath("//input[@id='identifierId']"));
	
	
	Assert.assertFalse(email.isDisplayed()&&email.isEnabled(), "DISABLED");
}
}
