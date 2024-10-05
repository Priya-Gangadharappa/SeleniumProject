package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Driventesting {
	
	@Test(dataProvider="inputs")
	public void Method1(String input)
	{

    ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	WebElement e1=driver.findElement(By.tagName("textarea"));
	e1.sendKeys(input+Keys.ENTER);
	}

	@DataProvider(name="inputs")
	public Object[][] data1()
	{
       return new Object[][] {{"How to become president"},{"How to wake up at 4Am"},{"Banglore"},{"Delhi"},{"How to be Humble"}};
		
	}
}
