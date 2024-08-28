package Selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_prog3_LogintoAmazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.in/s?k=shoe&crid=M7W8TTI8HYUN&sprefix=shoe%2Caps%2C1215&ref=nb_sb_noss_2");
		  
		WebElement un=  driver.findElement(By.name("email"));  
		//found the element by using locator and storing in the variable
		un.sendKeys("priya.@1212@gmail.com"); // performing action as typing username
		 
		WebElement cnt=  driver.findElement(By.id("continue"));
		  cnt.click();
		  
		  WebElement pwd=driver.findElement(By.name("password"));
		  pwd.sendKeys("Cybatron@1390");
		  
		  WebElement sn=driver.findElement(By.id("signInSubmit"));
		  sn.click();
		  
		  
	}

}
