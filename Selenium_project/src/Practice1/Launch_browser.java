package Practice1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Launch_browser 
{
	WebDriver driver;
	@Test
	public void method1()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Type 1 for Launching Chrome");
		System.out.println("Type 2 for Launching Edge");
		System.out.println("Type 3 for Launching Firefox");
		int input=	s1.nextInt();
		if(input==1)
		{
			 driver=new ChromeDriver();
		}
		if(input==2)
		{
			 driver=new EdgeDriver();
		}
		if(input==3)
		{
			 driver=new FirefoxDriver();
		}
	}
}
