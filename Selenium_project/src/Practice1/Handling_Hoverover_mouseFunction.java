package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Hoverover_mouseFunction {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in/");
		WebElement e1=driver.findElement(By.xpath("//span[.='Hello, sign in']"));		
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();	
		WebElement signin=driver.findElement(By.xpath("//span[.='Sign in']"));
		signin.click();
	}
}
