package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_parallel 
{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void testcase1(String nameofbrowser)
	{
		if(nameofbrowser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(nameofbrowser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		if(nameofbrowser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
	//	driver.manage().window().maximize();
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
	}
	
	
	
	
}
