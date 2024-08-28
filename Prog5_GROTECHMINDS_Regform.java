package Selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog5_GROTECHMINDS_Regform {

	public static void main(String[] args) 
	{
ChromeDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://grotechminds.com/registeration-form/");
		
		
		WebElement Fname=driver.findElement(By.id("firstName"));
	 Fname.sendKeys("Priya"+Keys.TAB);
	 
	 WebElement Lname=driver.findElement(By.id("lastName"));
	 Lname.sendKeys("Gangadhar"+Keys.TAB);
	 
	 WebElement Email=driver.findElement(By.id("email"));
	 Email.sendKeys("Priya.sg1212@gmail.com"+Keys.TAB);
	 
	 WebElement Pno=driver.findElement(By.id("phone"));
	 Pno.sendKeys("7411088304"+Keys.TAB);
	 
	 
	 WebElement Adhar=driver.findElement(By.id("aadhaar"));
	 Adhar.sendKeys("74110883041234"+Keys.TAB);
	 
	 WebElement Pan=driver.findElement(By.id("pan"));
	 Pan.sendKeys("CCXPP6666A"+Keys.TAB);
	 
	 WebElement terms=driver.findElement(By.id("terms"));
	 terms.click();
	 
	 WebElement Register=driver.findElement(By.className("btn btn-primary"));
	 Register.click();
	 
	}

}
