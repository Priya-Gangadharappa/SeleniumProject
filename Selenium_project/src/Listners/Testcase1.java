package Listners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListnerLogic.class)
public class Testcase1 extends ITestListnerLogic
{
	WebDriver driver;
	@Test
	public void Login_to_Amazon()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in/");
		WebElement Signin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(Signin);
		Signin.click();
		
		WebElement Username=driver.findElement(By.xpath("//input[@id='ap_email']"));
		Username.sendKeys("stbymkt@gmail.com"+Keys.TAB);
		
		WebElement continuee=driver.findElement(By.xpath("//input[@id='continue']"));
		continuee.click();
		
		WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("manish"+Keys.TAB);
		//WebElement SiginBtn=driver.findElement(By.xpath("//span[@id='auth-signddin-button']"));
		WebElement SiginBtn=driver.findElement(By.xpath("//span[@id='auth-signin-button']"));
		SiginBtn.click();
	}

}
