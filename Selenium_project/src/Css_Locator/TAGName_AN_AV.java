package Css_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TAGName_AN_AV {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in/");
		
		WebElement e1=driver.findElement(By.cssSelector("input[id^='twot']"));// ^ when we use caret we can write partial attribute value
			e1.sendKeys("SPEX"+Keys.ENTER);	
	}
}
