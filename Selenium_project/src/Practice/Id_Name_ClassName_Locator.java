package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Name_ClassName_Locator {

	public static void main(String[] args) {
	    ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in/");
		//WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	    //e1.sendKeys("Table"+Keys.ENTER);
		
		//WebElement e2=driver.findElement(By.name("field-keywords"));
		//e2.sendKeys("spex"+Keys.ENTER);
		
		//WebElement e3=driver.findElement(By.className("nav-input nav-progressive-attribute"));
		//e3.sendKeys("coffeemugs"+Keys.ENTER);
		
		
	}

}
