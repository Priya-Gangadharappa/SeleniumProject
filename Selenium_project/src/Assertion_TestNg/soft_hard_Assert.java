package Assertion_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class soft_hard_Assert {
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Assertion a1=new Assertion();
		a1.assertEquals(false, false);
		//When an assertion fails, don't throw an exception but record the failure
		SoftAssert s1=new SoftAssert();
		s1.assertEquals(false, false);
		
		driver.get("https://www.Google.com");
		
		WebElement e1=driver.findElement(By.name("q"));
		
		if(e1.isDisplayed()&& e1.isEnabled())
		{
	     e1.sendKeys("India"+Keys.ENTER);
		}
		
}
