package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Grotechminds {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement Drag=driver.findElement(By.xpath("//div[@id='container-1']"));
		WebElement Drop=driver.findElement(By.xpath("//div[@id='div2']"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(Drag, Drop).perform();
		Thread.sleep(1000);
		Actions a2=new Actions(driver);
		a2.dragAndDrop(Drop, Drag).perform();
	}
}
