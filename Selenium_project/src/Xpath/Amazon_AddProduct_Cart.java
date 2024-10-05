package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_AddProduct_Cart {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in");
		WebElement e1=driver.findElement(By.xpath("(//input)[5]"));
		e1.sendKeys("hp laptop"+Keys.ENTER);
		WebElement e2=driver.findElement(By.xpath("(//button)[3]"));
		e2.click();

	}

}
