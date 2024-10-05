package FileUpload_popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class popup1 {
	WebDriver driver;
	@Test
	public void pop()
	{
		driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement FN=driver.findElement(By.xpath("//input[@id='fname']"));
		FN.sendKeys("priya");
		WebElement LN=driver.findElement(By.xpath("//input[@id='lname']"));
		LN.sendKeys("gangadhar");
		WebElement EM=driver.findElement(By.xpath("//input[@id='email']"));
		EM.sendKeys("chatingp3@gmail.com");
		WebElement Pwd=driver.findElement(By.xpath("//input[@id='password']"));
		Pwd.sendKeys("Cybatron@1390");
		WebElement PA=driver.findElement(By.xpath("//textarea[@id='Present-Address']"));
		PA.sendKeys("retfgyhjklmknbhgvfdtre54");
		WebElement PerA=driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));
		PerA.sendKeys("sdfghjnmbvcfdrtyuijknmb");
		WebElement Pin=driver.findElement(By.xpath("//input[@id='Pincode']"));
		Pin.sendKeys("678909");
		WebElement ChooseFile=driver.findElement(By.xpath("//input[@id='file']"));
		ChooseFile.sendKeys("C:\\Users\\priya\\Downloads\\Thesis_format_Grandmasters.pdf");
		
			}

}
