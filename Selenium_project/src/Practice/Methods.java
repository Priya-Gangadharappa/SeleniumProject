package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/"); // gets the url
		WebElement e1=driver.findElement(By.tagName("textarea"));
		e1.sendKeys("India"+Keys.ENTER);
		String title=driver.getTitle();// it shows the title of the page 
		System.out.println(title);
		String h1=driver.getWindowHandle(); // it will give you the browser Id of the parent tab
		System.out.println(h1);
		Set<String> h2=driver.getWindowHandles(); // it will give you the browser id both the parent and child tabs
		System.out.println(h2);
		//driver.close(); // it will close the parent browser
		driver.quit(); // it will close parent and child browser
		
	}
}
