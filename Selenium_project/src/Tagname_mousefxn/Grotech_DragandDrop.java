package Tagname_mousefxn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotech_DragandDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement e1=driver.findElement(By.xpath("//div[@id='container-6']"));
		WebElement e2=driver.findElement(By.xpath("//div[@id='div2']"));
	
		Actions a1=new Actions(driver);
		a1.dragAndDrop(e1, e2).perform();
		Thread.sleep(2000);
		Actions a2=new Actions(driver);
		a2.dragAndDrop(e2,e1).perform();

	}

}
