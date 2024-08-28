package Selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog14_Axis_Login {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://omni.axisbank.co.in/axisretailbanking/");
		
		driver.manage().window().maximize();
		
		WebElement LoginButton=driver.findElement(By.linkText("Login ID / Customer ID"));
		LoginButton.click();
		Thread.sleep(3000);
		WebElement CustomerID=driver.findElement(By.id("custid"));
		CustomerID.sendKeys("987654432"+Keys.TAB);
		Thread.sleep(3000);
		WebElement pwd=driver.findElement(By.id("pass"));
		  pwd.sendKeys("Cybatron@1390"+Keys.TAB);
		  Thread.sleep(3000);
		  WebElement LoginButton1=driver.findElement(By.id("APLOGIN"));
			LoginButton1.click();
		
		
		
	}

}
