package Robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Gmail {
	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Google.in");
		WebElement e1=driver.findElement(By.xpath("//a[.='Images']"));
         Actions a1=new Actions(driver);
         a1.contextClick(e1).perform();
         
         Robot r1=new Robot();
         r1.keyPress(KeyEvent.VK_DOWN);
         Thread.sleep(1000);
         r1.keyPress(KeyEvent.VK_DOWN);
         Thread.sleep(1000);
         r1.keyPress(KeyEvent.VK_DOWN);
         Thread.sleep(1000);
         r1.keyPress(KeyEvent.VK_ENTER);

         
         
	}
}
