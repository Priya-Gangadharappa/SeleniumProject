package Selenium_prog;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Edge
{
	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver driver = new EdgeDriver();// launch the edge browser
         driver.get("https://www.google.com"); // launch the Url
         
         Thread.sleep(4000);// it sleeps for 4 sec and close the browser
         
     // driver.close();//close the parent browser
   driver.quit();// it will close  both parent and child browser
         
	}

}
