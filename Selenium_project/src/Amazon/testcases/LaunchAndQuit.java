package Amazon.testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchAndQuit 
{
	WebDriver driver;
	@BeforeMethod
	public void Launch()
	{
	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in/");
		WebElement Signin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(Signin).perform();
		Signin.click();
		
		WebElement Username=driver.findElement(By.xpath("//input[@id='ap_email']"));
		Username.sendKeys("7411088304"+Keys.TAB);
		
		WebElement continuee=driver.findElement(By.xpath("//input[@id='continue']"));
		continuee.click();
		
		WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("Doctor@9496"+Keys.TAB);
	}
	
@AfterMethod
public void quit() throws IOException
{
	WebElement Hover=driver.findElement(By.xpath("//span[@class='nav-line-2'] "));
	Actions a2=new Actions(driver);
	a2.moveToElement(Hover).perform();
	
	WebElement Logout=driver.findElement(By.xpath(""));
	Logout.click();
	
	
	TakesScreenshot t1=(TakesScreenshot) driver;
	File source=t1.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\priya\\OneDrive\\Desktop\\grotech3.png");
    FileHandler.copy(source,destination);
	
	
	
	
	
driver.quit();
}
}
