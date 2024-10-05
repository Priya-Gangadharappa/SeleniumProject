package Practice1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Test;

public class LaunchBrowser_Otherway 
{
	WebDriver driver;
@Test
public void Method1()
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Type 1 for Launching ChromeBrowser");
	System.out.println("Type 2 for Launching FirefoxBrowser");
	System.out.println("Type 3 for Launching EdgeBrowser");
	int input=s1.nextInt();
	
	if(input==1)
	{
	 driver=new ChromeDriver();
	}
	if(input==2)
	{
		driver=new FirefoxDriver();	
	}
	if(input==3)
	{
		driver=new EdgeDriver();	
	}
}
}
