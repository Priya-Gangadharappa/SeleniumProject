package Headless_Mode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multidata_Headless {

	@Test(dataProvider="Inputs")
	public void Method1(String Input) // if annotation is having parameter then method should also have parameter
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
	ChromeDriver driver=new ChromeDriver(options);`
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	WebElement e1=driver.findElement(By.name("q")); //google search field locator name
    e1.sendKeys(Input+Keys.ENTER);
}
	
@DataProvider(name ="Inputs")
public Object[][] Data1()
{
	return new Object[][] {{"How to become president"}, {"How to wake up at 4Am"}, {"How to pass parameter"},{"Bangalore"},{"Delhi"}};
	
}
}
