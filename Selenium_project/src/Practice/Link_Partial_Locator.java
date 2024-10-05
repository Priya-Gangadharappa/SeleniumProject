package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Partial_Locator {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in/");
		//WebElement e1=driver.findElement(By.linkText("Gmail"));
		//e1.click();
		
		//WebElement e2=driver.findElement(By.partialLinkText("Best"));
		//e2.click();
		
		
	}

}
