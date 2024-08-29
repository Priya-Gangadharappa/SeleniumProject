package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Siginpage_Relative {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in");
		
		driver.findElement(By.xpath("(//span)[14]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("priya.sg1212@gmail.com"+Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[10]")).click();
		

	}

}
