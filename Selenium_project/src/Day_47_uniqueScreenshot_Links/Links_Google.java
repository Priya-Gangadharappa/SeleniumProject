package Day_47_uniqueScreenshot_Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Google {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		List<WebElement>  l1=driver.findElements(By.tagName("a"));
		
		System.out.println(l1.size());
		
		for(int i=0;i<l1.size();i++)
		{
			WebElement e1=l1.get(i);
			String url=e1.getAttribute("href"); // here we get the every href url (get value of href)
			
			String text=e1.getText();// here we get text
			System.out.println(url);
			System.out.println(text);
			
		}

	}

}
