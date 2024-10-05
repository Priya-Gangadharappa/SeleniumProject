package Css_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_TagName {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email=driver.findElement(By.cssSelector("input[id='email']"));
		email.sendKeys("grotech@gmail.com"+Keys.TAB);
		
		WebElement password=driver.findElement(By.cssSelector("input[id='pass']"));
		password.sendKeys("Cybatron@123"+Keys.TAB);
	}

}
