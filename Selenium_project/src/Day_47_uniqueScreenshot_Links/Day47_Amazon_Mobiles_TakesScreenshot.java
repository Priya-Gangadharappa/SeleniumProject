package Day_47_uniqueScreenshot_Links;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Day47_Amazon_Mobiles_TakesScreenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in");
		
		WebElement e1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("Mobiles"+Keys.ENTER);
		
	/*	List<WebElement> L1=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	 * 
		int count=L1.size();
		L1.get(count-10).click();*/
		
		TakesScreenshot t1=driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
        //File destination=new File("C:\\Users\\priya\\OneDrive\\Desktop\\grotech"+Math.random()+".png");
		
		//File destination=new File("C:\\Users\\priya\\OneDrive\\Desktop\\tech"+new Day47_Amazon_Mobiles_TakesScreenshot().getClass()+".png");
		
		File destination=new File("C:\\Users\\priya\\OneDrive\\Desktop\\grotech11"+new Date(0).toString().getClass()+".png");
        FileHandler.copy(source, destination);
	}

}
