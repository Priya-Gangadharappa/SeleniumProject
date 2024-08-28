package Selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Prog8_Amazon_Bestsellers_Linktext { 

	public static void main(String[] args) 
{
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Best Sellers")).click();

	}

}
