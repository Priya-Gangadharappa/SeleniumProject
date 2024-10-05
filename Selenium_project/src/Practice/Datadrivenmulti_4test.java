package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadrivenmulti_4test {
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
		Username.sendKeys("7411088304"+Keys.TAB);
		
		WebElement continuee=driver.findElement(By.xpath("//input[@id='continue']"));
		continuee.click();
		
		WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("Doctor@9496"+Keys.TAB);
		
		WebElement SiginBtn=driver.findElement(By.xpath("//span[@id='auth-signin-button']"));
		SiginBtn.click();
	}
	@DataProvider(name="data1")
	public Object[][] Method1()
	{
		Object[][] d1=new Object[4][2];
		//1st row
		d1[0][0]="7411088304";// valid mobile no
	    d1[0][1]="Doctor@9496";//valid password
	    //2nd row
		d1[1][0]="9353472439";//email id
		d1[1][1]="Angel@143";//valid email id
		//3rd row
		d1[2][0]="9876543210";//invalid mobileno 
		d1[2][1]="kjhg8765";//
		//4th row
		d1[3][0]="priyasg@gmail.com";//invalid emailid
		d1[3][1]="kjhgf876";
		return d1;
	}

}
