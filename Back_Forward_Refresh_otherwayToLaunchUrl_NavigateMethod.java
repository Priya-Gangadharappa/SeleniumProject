package Selenium_prog;

import org.openqa.selenium.chrome.ChromeDriver;

public class Back_Forward_Refresh_otherwayToLaunchUrl_NavigateMethod
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();// launch empty browser
        driver.get("https://www.google.com"); //launch the google browser
        driver.manage().window().maximize(); // maximize the browser
        
        driver.navigate().back();
        Thread.sleep(2000);
        
        driver.navigate().forward();
        Thread.sleep(2000);
        
        driver.navigate().refresh();
        Thread.sleep(2000);
        
        driver.navigate().to("https://Amazon.com");
        
        
	}

}
