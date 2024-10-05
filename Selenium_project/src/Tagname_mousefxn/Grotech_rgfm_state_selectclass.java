package Tagname_mousefxn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotech_rgfm_state_selectclass {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		
		driver.get("https://grotechminds.com/registeration-form/");
		
		WebElement e1=driver.findElement(By.name("state"));
		Select s1=new Select(e1);
		//s1.selectByIndex(13);
		Thread.sleep(2000);
		s1.selectByValue("karnataka");
		//s1.selectByVisibleText("Karnataka");

	}

}
