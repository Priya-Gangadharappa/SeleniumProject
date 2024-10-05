package FetchingExcel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Fetching_MutipleData_fblogin1 extends Fetching_multipleData
{
	WebDriver driver;
	@Test
	public void FB_Login() throws EncryptedDocumentException, IOException
	{
		Fetching_multipleData m1=new Fetching_multipleData();
		m1.multidata();
		
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Amazon.in/");
	WebElement Signin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	Actions a1=new Actions(driver);
	a1.moveToElement(Signin);
	Signin.click();

	WebElement Username=driver.findElement(By.xpath("//input[@id='ap_email']"));
	Username.sendKeys(Un);//taken from Fetching_multipleData class

	WebElement continuee=driver.findElement(By.xpath("//input[@id='continue']"));	
	continuee.click();

	WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
	password.sendKeys(pwd);// taken from Fetching_multipleData class
	
	
	}
}
