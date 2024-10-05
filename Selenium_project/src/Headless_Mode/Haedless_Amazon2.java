package Headless_Mode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class Haedless_Amazon2 {
	@Test
	public void Amazonheadless()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Amazon.in/");
	WebElement Signin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	Actions a1=new Actions(driver);
	a1.moveToElement(Signin);
	Signin.click();
	
	WebElement Username=driver.findElement(By.xpath("//input[@id='ap_email']"));
	Username.sendKeys("7411088304"+Keys.TAB);
	
	WebElement continuee=driver.findElement(By.xpath("//input[@id='continue']"));
	continuee.click();
	
	WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
	password.sendKeys("Doctor@9496"+Keys.TAB);
	
	WebElement SiginBtn=driver.findElement(By.xpath("//span[@id='auth-signin-button']"));
	SiginBtn.click();
}
}
