package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_TypeShoe_select2ndOption
{
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement e1=driver.findElement(By.name("q"));
	e1.sendKeys("shoe");
	Thread.sleep(2000);
	
	List<WebElement> l1=driver.findElements(By.xpath("//form[@class='_2rslon header-form-search opXDaO']/ul/li"));
	int count=l1.size();
	//System.out.println(count);
	l1.get(count-9).click();
	
	
}
}
