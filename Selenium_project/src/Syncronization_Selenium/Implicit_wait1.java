package Syncronization_Selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait1 
{
	static WebDriver driver;
public static void main(String[] args) 
{	
	driver=new ChromeDriver();
	driver.get("https://www.Amazon.in/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement e1=driver.findElement(By.linkText("About Amazon"));
    Point p1=e1.getLocation();
	int x=p1.getX();
	int y=p1.getY();
	System.out.println(x);
	System.out.println(y);
	
	JavascriptExecutor js1=(JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,"+y+")");
	
}
}