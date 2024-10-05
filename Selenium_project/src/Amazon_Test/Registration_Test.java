package Amazon_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Registration_Test 
{
WebDriver driver;
@Test
public void Registration()
{
	driver=new ChromeDriver();
	driver.get("https://www.Amazon.in/");
	driver.manage().window().maximize();
	
	
}
}
