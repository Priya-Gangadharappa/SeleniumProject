package co_ordinates;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class coordinates_Amazon 
{
	WebDriver driver;
	@Test
	public void AboutAmazon()
 {		
driver =new EdgeDriver();
 driver.get("https://www.Amazon.in/");
 driver.manage().window().maximize();
 WebElement About=driver.findElement(By.linkText("About Amazon"));
 Point p1= About.getLocation();
  int x=p1.getX();  // x is small value 
  int y=p1.getY(); // y will be bigger value 
  System.out.println(x);
  System.out.println(y);
}
}