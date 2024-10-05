package Autosuggestions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazon_Typeshoe_select4thoption {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in");
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Shoes");
		Thread.sleep(2000);
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
        int count=li.size();
        li.get(count-7).click(); 
        
       
	}

	

}
