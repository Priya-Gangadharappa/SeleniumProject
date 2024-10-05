package Headless_Mode;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Firefox_Headless 
{
	@Test(dataProvider="Data1")
	public void Integer(int Input)
	{
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--headless");
	FirefoxDriver driver=new FirefoxDriver(options);
	driver.get("https://www.google.com/");
		System.out.println(Input);
	}
	@DataProvider(name="Data1")
	public Object[][] DataDriven()
	{
		return new Object[][] {{24},{48},{82},{102},{188}};
		
	}
}