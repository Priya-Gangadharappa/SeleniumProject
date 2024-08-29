package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Youetube_Signin_Relative {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		
		WebElement e1=driver.findElement(By.xpath("(//input)[6]"));
		e1.click();
	}

}
