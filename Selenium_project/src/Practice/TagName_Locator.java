package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TagName_Locator {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		WebElement e3=driver.findElement(By.tagName("a"));
		e3.click();
		
		TakesScreenshot t1=driver;
	    File source=t1.getScreenshotAs(OutputType.FILE);
        File destination=new File("C:\\Users\\priya\\OneDrive\\Desktop\\Take1.png");
        FileHandler.copy(source, destination);
        
	}

	
	}


