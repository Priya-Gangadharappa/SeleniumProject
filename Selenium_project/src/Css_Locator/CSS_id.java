package Css_Locator;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CSS_id {

	public static void main(String[] args) throws IOException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in/");
		
		WebElement e1=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
          e1.sendKeys("shoes"+Keys.ENTER);
          
          
       /*   TakesScreenshot t1= (TakesScreenshot) driver;
          File Source=t1.getScreenshotAs(OutputType.FILE);
          File destination=new File("C:\\Users\\priya\\OneDrive\\Desktop\\Cssselector.png");
          FileHandler.copy(Source, destination);*/
          
	}
	}


