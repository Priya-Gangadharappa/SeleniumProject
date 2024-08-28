package Selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Prog11_Amazon_partial_Todaysdeals

{
	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/search?q=amazon&form=ANNTH1&refig=110acb4f2e404f95901ecdda804a485c&pc=HCTS&pq=amzo&pqlth=4&assgl=6&sgcn=amazon&qs=OS&smvpcn=0&swbcn=10&sc=10-4&sp=1&ghc=0&cvid=110acb4f2e404f95901ecdda804a485c&clckatsg=1&hsmssg=0");
		driver.findElement(By.partialLinkText("Today's")).click();
		
	}
	
}
