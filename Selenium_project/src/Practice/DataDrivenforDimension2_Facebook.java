package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenforDimension2_Facebook 
{
	@Test(dataProvider="Data1" )
	public void Facebook(String un,String pwd)
	{
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement UserName=driver.findElement(By.xpath("//input[@id='email']"));
UserName.sendKeys(un+Keys.TAB);
WebElement Password=driver.findElement(By.xpath("//input[@id='pass']"));
Password.sendKeys(pwd+Keys.TAB);
WebElement Login=driver.findElement(By.xpath("//button[@name='login']"));
Login.click();
	}
	@DataProvider(name="Data1")
	public Object[][] DataDriven1()
	{
		Object[][] D1=new Object[2][2];
		//1St Row
		D1[0][0]="ABCDEF@GMAIL.COM";
		D1[0][1]="78ujhgfr#5";
		//2nd row
		D1[1][0]="acdfhtf@yahoo.com";
		D1[1][1]="iu0987@#nb";
		return D1;		
		
		
	}
}
