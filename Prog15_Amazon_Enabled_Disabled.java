package Selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog15_Amazon_Enabled_Disabled {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.Amazon.in");// Launching google
		
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Shoes"+Keys.ENTER); 
		
        if(e1.isEnabled() && e1.isDisplayed())
        {
        	e1.sendKeys("shoes"+Keys.ENTER);
        }
	}

}
