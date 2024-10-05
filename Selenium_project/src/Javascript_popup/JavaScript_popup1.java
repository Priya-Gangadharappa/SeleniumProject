package Javascript_popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript_popup1 
{
WebDriver driver;
@Test
public void popup()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/priya/OneDrive/Documents/learningHTML1.html");
	String s1=driver.switchTo().alert().getText();
	System.out.println(s1);
	driver.switchTo().alert().accept();
	WebElement userName=driver.findElement(By.xpath("//input[@id='1']"));
	userName.sendKeys("Priya");
	
}
}
