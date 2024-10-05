package Day_47_uniqueScreenshot_Links;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Day46_Googel_Sceenshot {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	WebElement e1=driver.findElement(By.name("q")); //google search field locator name
    e1.sendKeys("Bangalore");
    Thread.sleep(2000);
    List<WebElement> li= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
    
    int count=li.size(); // it returns the number of auto-suggestions
    li.get(count-5).click();
    
    TakesScreenshot t1= driver; // 
    File source=t1.getScreenshotAs(OutputType.FILE);
    File destination=new File("C:\\Users\\priya\\OneDrive\\Desktop\\grotech3.png");
    FileHandler.copy(source,destination);
    
	}

}
