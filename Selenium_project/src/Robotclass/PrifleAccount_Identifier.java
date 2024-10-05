package Robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PrifleAccount_Identifier
{
	@Test
	public void profile() throws AWTException, InterruptedException
	{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Google.in");
	WebElement e1=driver.findElement(By.xpath("//a[@class='gb_Ua gb_zd gb_qd gb_hd']"));
	Actions a1=new Actions(driver);
	a1.contextClick(e1).perform();
     
     Robot R1=new Robot();
     R1.keyPress(KeyEvent.VK_DOWN);
     R1.keyPress(KeyEvent.VK_DOWN);
     Thread.sleep(1000);
     R1.keyPress(KeyEvent.VK_DOWN);  
     R1.keyPress(KeyEvent.VK_ENTER);
	}
}
