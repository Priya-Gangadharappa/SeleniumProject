package Selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog12_sbi_Login_partialLinkText {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.name("userName")).sendKeys("priya123"+Keys.TAB);
		
		driver.findElement(By.name("password")).sendKeys("456fgh"+Keys.TAB);
		
		driver.findElement(By.id("loginCaptchaValue")).sendKeys("kfghk"+Keys.TAB);
		
		
		
		
		
	

	}

}
