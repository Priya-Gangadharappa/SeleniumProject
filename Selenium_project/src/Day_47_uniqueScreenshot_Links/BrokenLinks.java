package Day_47_uniqueScreenshot_Links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement>  l1=driver.findElements(By.tagName("a"));
		
		System.out.println(l1.size());
		
		for(int i=0;i<l1.size();i++)
		{
			WebElement e1=l1.get(i);
			String url=e1.getAttribute("href"); // here we get the every href url (get value of href)
			System.out.println(url);
			verify_the_link(url);
		}

	}
		static void verify_the_link(String url) throws IOException
		{
			try {
			URL u1=new URL(url);
		HttpURLConnection u2=(HttpURLConnection) u1.openConnection();
			
			if(u2.getResponseCode()==200)
			{
				System.out.println("Valid Link " +u2.getResponseMessage() +" "+u2.getResponseCode());
			}
			else
			{
				System.out.println("Invalid Link"+u2.getResponseMessage() +" "+u2.getResponseCode());
			}
			}
			catch(MalformedURLException m1)
			{
				System.out.println("handled it");
			}
		}
	

	

}
