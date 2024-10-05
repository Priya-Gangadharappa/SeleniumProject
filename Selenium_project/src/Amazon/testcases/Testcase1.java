package Amazon.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase1 extends LaunchAndQuit
{
@Test
public void Login()
{
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("Shoes"+Keys.ENTER);
}
}
