package Selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Google_type_India
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.Google.com");
		
		WebElement e1=driver.findElement(By.name("q"));
		
		if(e1.isDisplayed()&& e1.isEnabled())
		{
	     e1.sendKeys("India"+Keys.ENTER);
		}
		
	
		

	}

}
