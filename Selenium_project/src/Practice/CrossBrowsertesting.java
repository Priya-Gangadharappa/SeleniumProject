package Practice;

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

public class CrossBrowsertesting 
{
	WebDriver driver;
@Test
@Parameters("browser")
public void testcase1(String nameofBrowser)
{
	if(nameofBrowser.equals("Chrome"))
	{
		
		driver=new ChromeDriver();
	}
	if(nameofBrowser.equals("Firefox"))
	{
	driver=new FirefoxDriver();
	}
	if(nameofBrowser.equals("Edge"))
	{
		driver=new EdgeDriver();
	}
	
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

