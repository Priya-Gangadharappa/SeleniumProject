package Tagname_mousefxn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Dropdown_selecctBooks {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in");
     WebElement e1=driver.findElement(By.id("searchDropdownBox"));
     Select s1=new Select(e1);
     s1.selectByValue("search-alias=stripbooks");
     //s1.selectByVisibleText("Books");
     //s1.selectByIndex(10);
     
	
		
	}

}
