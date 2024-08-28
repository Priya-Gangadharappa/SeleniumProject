package Selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_prog4_FacebookLogin {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1348028");
		
		driver.manage().window().maximize();
		
		WebElement EmailAddress=driver.findElement(By.name("email"));
		EmailAddress.sendKeys("PriyaGangadhar"+Keys.TAB);
		
		WebElement Pwd=driver.findElement(By.name("pass"));
		Pwd.sendKeys("dfghjk@nm"+Keys.TAB);
		
		WebElement Login=driver.findElement(By.name("login"));
		Login.click();
	}

}
