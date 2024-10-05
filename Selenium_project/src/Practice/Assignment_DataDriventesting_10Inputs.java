package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment_DataDriventesting_10Inputs 
{
	WebDriver driver;
@Test(dataProvider="Inputs")
public void Amazon(String Inputs)
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Amazon.in/");
	WebElement e1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	e1.sendKeys(Inputs+Keys.ENTER);
}
@DataProvider(name="Inputs")
public Object[][] Data1()
{
	return new Object[][] {{"Shoes"},{"MobileStand"},{"spex"},{"Laptopstand"},
		{"BackcaseIphone"},{"Iphone16"},{"ChargerIphone16"},{"sandals"},{"Fan"},{"PenStand"}};	
}

	}

