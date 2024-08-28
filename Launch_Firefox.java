package Selenium_prog;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox {

	public static void main(String[] args) 
	{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.Amazon.com");
System.out.println(driver.getWindowHandle()); // give the parent browser id 
System.out.println(driver.getWindowHandles());//give the parent and child browser id 

 String title=driver.getTitle(); // gets the title of the page 
 System.out.println(title);


	}

}
