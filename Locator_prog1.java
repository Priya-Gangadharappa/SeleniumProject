package Selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator_prog1 {

	public static void main(String[] args) 
	{
	  ChromeDriver driver=new ChromeDriver(); // launch the empty broswer 
	  driver.manage().window().maximize();
		driver.get("https://www.google.com"); // get the google browser
		
		driver.findElement(By.name("q")).sendKeys("India");// Type India in search bar
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.name("btnk")).click();
		
		driver.manage().window().minimize();
}

}
