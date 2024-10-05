package Autosuggestions;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CurrentTime_withScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/");
		driver.manage().window().maximize();
		
		WebElement searchinitial=driver.findElement(By.xpath("//div[@class='SearchPlaceholder_searchRoot__LWDXI icon-searchIcon SearchPlaceholder_icon___bJlq']"));
		searchinitial.click();
		WebElement searchFinal=driver.findElement(By.xpath("//input[@id='searchProduct']"));
		Thread.sleep(2000);
		searchFinal.sendKeys("PCM");
		
		Thread.sleep(2000);
		
		List<WebElement> pro=driver.findElements(By.xpath("//div[@class='MedicineAutoSearch_searchList___m_g7 null']/ul/li"));
		System.out.println(pro.size());
		Thread.sleep(3000);
		pro.get(2).click();
		
		
		
		Date d1 = new Date(0);
		d1.getTime();
		Date d2 = new Date(d1.getTime());
		String time =d2.toString();
		String date =time.substring(8,10);
		String month = time.substring(4,7);
		String year=time.substring(time.length()-4);
		String exactTime = time.substring(11,13);
		String correctTime=exactTime.replace(":", "_");
		String dateFormat1= date.concat(month).concat(year).concat(correctTime);
			
		
		TakesScreenshot ts=driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\priya\\OneDrive\\Desktop\\Apolo"+dateFormat1+".png");
		FileHandler.copy(source, destination);
		
		
	}

}
