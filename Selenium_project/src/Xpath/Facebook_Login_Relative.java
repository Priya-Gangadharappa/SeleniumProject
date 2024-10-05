package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login_Relative {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebooklogin.com/");
		
		driver.manage().window().maximize();
		
		WebElement EmailAddress=driver.findElement(By.xpath("(//input)[3]"));
		EmailAddress.sendKeys("PriyaGangadhar"+Keys.TAB);
		
		WebElement Pwd=driver.findElement(By.xpath("(//input)[4]"));
		Pwd.sendKeys("dfghjk@nm"+Keys.TAB);
		
	}

}
