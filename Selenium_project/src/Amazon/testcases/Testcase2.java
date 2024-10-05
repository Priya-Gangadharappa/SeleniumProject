package Amazon.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase2 extends LaunchAndQuit
{
@Test
public void Firstoption()
{
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("Shoes"+Keys.ENTER);
	
	WebElement option=driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline']"));
	option.click();
}

}
