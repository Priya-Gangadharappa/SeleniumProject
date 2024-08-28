package Selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prog13_Myntra_mens_Linktext 
{

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Men")).click();
		
	}

}
