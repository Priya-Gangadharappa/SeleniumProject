package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriventesting_multidata_Amazon 
{
@Test(dataProvider="data1")
public void login(String un,String pwd)
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Amazon.in/");
	WebElement Signin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	Actions a1=new Actions(driver);
	a1.moveToElement(Signin);
	Signin.click();
	
	WebElement Username=driver.findElement(By.xpath("//input[@id='ap_email']"));
	Username.sendKeys(un+Keys.TAB);
	
	WebElement continuee=driver.findElement(By.xpath("//input[@id='continue']"));
	continuee.click();
	
	WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
	password.sendKeys(pwd+Keys.TAB);
	
	WebElement SiginBtn=driver.findElement(By.xpath("//span[@id='auth-signin-button']"));
	SiginBtn.click();
}
@DataProvider(name="data1")
public Object[][] Method1()
{
	Object[][] d1=new Object[2][2];
	//1st row
	d1[0][0]="7411088304";// valid mobile no
    d1[0][1]="Doctor@9496";//valid password
    //2nd row
	d1[1][0]="9353472439";//email id
	d1[1][1]="Angel@143";//valid email id
	return d1;
}
}
