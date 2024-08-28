package Selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yono_Sbi_Login {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/search?q=sbi+online+login&cvid=07e7cb62f7e5434bb9a230a3daf36004&gs_lcrp=EgZjaHJvbWUqBggBEAAYQDIGCAAQRRg5MgYIARAAGEAyBggCEAAYQDIGCAMQLhhAMgYIBBAAGEAyBggFEAAYQDIGCAYQABhAMgYIBxAAGEAyBggIEAUYQNIBCDMzOTlqMGo0qAIIsAIB&FORM=ANAB01&PC=HCTS");
		
		driver.manage().window().maximize();
		
		WebElement UID=driver.findElement(By.id("userName"));
		UID.sendKeys("sbi98765"+Keys.TAB);
		
		WebElement PWD=driver.findElement(By.id("password"));
		PWD.sendKeys("Doctor@9876"+Keys.TAB);
		
		WebElement LoginButton=driver.findElement(By.id("login"));
		LoginButton.click();
		
		

	}

}
