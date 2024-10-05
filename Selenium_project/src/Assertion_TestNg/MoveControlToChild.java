package Assertion_TestNg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MoveControlToChild
{
private static final Set<String> String = null;

@Test
public void Amazon() throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Amazon.in");
	
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("Shoe"+Keys.ENTER);
	
	WebElement e2=driver.findElement(By.className("s-image"));
	e2.click();
	
	WebElement e3=driver.findElement(By.xpath("//input[@class='a-button-input']"));
	e3.click();
	
	Set<String>  s1=driver.getWindowHandles(); //because id's will be alphanumeric
	System.out.println(s1);
	
	driver.close();// closes the window which has control
	
	Iterator <String> i1=s1.iterator();
	String Parentid=i1.next();
	String childid=i1.next();
	System.out.println(Parentid);
	System.out.println(childid);
	driver.switchTo().window(childid); // control will be switchto child window
	
	Thread.sleep(1000);
	driver.close(); // child window should be closed
}
}
