package Day_47_uniqueScreenshot_Links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToGetBrokenLinks_Amazon {

	public static void main(String[] args) throws 
IOException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in/");
		
		List<WebElement> l1=driver.findElements(By.tagName("a"));
		
		System.out.println(l1.size());
		
		for(int i=0;i<l1.size();i++) 
		{
		WebElement w1=l1.get(i);
		String url=w1.getAttribute("href");
		System.out.println(url);// url will be passed from this line to verifythelink(url)
		//verify_the_link(url); // verifying the individual link
	    }
	}
	static void verify_the_link(String url) throws IOException
	{
		try
		{
		URL u1=new URL(url);//creating object of url class, URL is a class and import from java.net package
		HttpURLConnection u2=(HttpURLConnection) u1.openConnection();
		if(u2.getResponseCode()==200)
       {
	  System.out.println("Valid Link"+u2.getResponseMessage() +" "+u2.getResponseCode());// concatination 
        }
		else
		{
			System.out.println("Invalid link"+u2.getResponseMessage() +" "+u2.getResponseCode());
		}
		}
		catch(NoSuchWindowException n1)
		{
			System.out.println("handled it");
		}
	}
}
//href is null hence we get null