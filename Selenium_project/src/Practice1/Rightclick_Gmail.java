package Practice1;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick_Gmail {
	public static void main(String[] args) throws AWTException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Google.in");
		WebElement e1=driver.findElement(By.xpath("//a[.='Images']"));
         Actions a1=new Actions(driver);
         a1.contextClick(e1).perform();
         
         Robot r1=new Robot();
	}
}
