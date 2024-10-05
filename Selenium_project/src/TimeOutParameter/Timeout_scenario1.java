package TimeOutParameter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Timeout_scenario1 {
	
	WebDriver driver;
	@Test(timeOut=9000)
	public void login_Amazon()
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Amazon.in/");
	WebElement Signin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	Actions a1=new Actions(driver);
	a1.moveToElement(Signin);
	Signin.click();
	
	WebElement Username=driver.findElement(By.xpath("//input[@id='ap_email']"));
	Username.sendKeys("shakira.shaik@outlook.com"+Keys.TAB);
	
	WebElement continuee=driver.findElement(By.xpath("//input[@id='continue']"));
	continuee.click();
	
	WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
	password.sendKeys("Apvpwd@1013"+Keys.TAB);
	
	WebElement SiginBtn=driver.findElement(By.xpath("//span[@id='auth-signin-button']"));
	SiginBtn.click();
}
}
