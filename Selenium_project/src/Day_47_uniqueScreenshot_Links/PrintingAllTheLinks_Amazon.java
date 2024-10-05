package Day_47_uniqueScreenshot_Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingAllTheLinks_Amazon {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in/");
		
		List<WebElement> e1=driver.findElements(By.tagName("a"));
		System.out.println(e1.size());// fetch all the links and show the size
		
		for(int i=0;i<e1.size();i++)
		{
			WebElement w1=e1.get(i);
			String id=w1.getAttribute("id");
			System.out.println(id);
			String Url=w1.getAttribute("href");
			//String text=w1.getText();
			
			System.out.println(Url);
			//System.out.println(text);
			
		}

	}

}
