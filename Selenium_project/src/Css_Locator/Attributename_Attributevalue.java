package Css_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attributename_Attributevalue {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in/");
		
		WebElement e1=driver.findElement(By.cssSelector("[id='twotabsearchtextbox']"));
		e1.sendKeys("Tv"+Keys.TAB);
	}

}
