package Selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog16_Checkbox_IsSelected {

	public static void main(String[] args) throws InterruptedException 
	{
     ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registeration-form/");
		WebElement Fname=driver.findElement(By.id("firstName"));
		 Fname.sendKeys("Priya"+Keys.TAB);
		 
		 Thread.sleep(2000);
		 WebElement Lname=driver.findElement(By.id("lastName"));
		 Lname.sendKeys("Gangadhar"+Keys.TAB);
		 
		 Thread.sleep(2000);
		 WebElement Email=driver.findElement(By.id("email"));
		 Email.sendKeys("Priya.sg1212@gmail.com"+Keys.TAB);
		 
		 Thread.sleep(2000);
		 WebElement Pno=driver.findElement(By.id("phone"));
		 Pno.sendKeys("7411088304"+Keys.TAB);
		 
		 Thread.sleep(2000);
		 WebElement Adhar=driver.findElement(By.id("aadhaar"));
		 Adhar.sendKeys("74110883041234"+Keys.TAB);
		 
		 Thread.sleep(2000);
		 WebElement Pan=driver.findElement(By.id("pan"));
		 Pan.sendKeys("CCXPP6666A"+Keys.TAB);
		 
		 Thread.sleep(2000);
		 WebElement terms=driver.findElement(By.id("terms"));
		 if(terms.isSelected() && terms.isEnabled())
		 {
			 System.out.println("checkbox is selected");
		 }
		 else
		 {
			 System.out.println("is not selected ,lets select checkbox");
			 terms.click();
		 }
		 
		 Thread.sleep(2000);
		 WebElement Register=driver.findElement(By.linkText("Register"));
		 Register.click();
		 
		 Thread.sleep(2000);
		
		 driver.navigate().back();

	}

}
