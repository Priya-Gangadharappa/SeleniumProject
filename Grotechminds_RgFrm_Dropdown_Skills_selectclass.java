package Tagname_mousefxn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotechminds_RgFrm_Dropdown_Skills_selectclass {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		
		driver.get("https://grotechminds.com/registration/");
		
		WebElement e1=driver.findElement(By.name("Skills"));
		Select s1=new Select(e1);
		//s1.selectByValue("select1");
		//s1.selectByIndex(1);
		//s1.selectByVisibleText("Technical Skills");
		
		//s1.selectByIndex(2);
		//s1.selectByValue("select2");
		Thread.sleep(2000);
		s1.selectByVisibleText("Non-Technical Skills");
	}

}
