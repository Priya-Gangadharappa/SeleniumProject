package FetchingExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase_Fetchingvalue {
	WebDriver driver;
	@Test
	public void Testcase1() throws EncryptedDocumentException, IOException
	{
		
	
FileInputStream f1=new FileInputStream("C:\\Users\\priya\\eclipse-workspace\\Selenium_project\\DataFetching\\PriyaSheet.xlsx");
Workbook w1=WorkbookFactory.create(f1);
String Un=w1.getSheet("Login_Details").getRow(1).getCell(0).getStringCellValue();
System.out.println(Un);
String pwd=w1.getSheet("Login_Details").getRow(1).getCell(1).getStringCellValue();
System.out.println(pwd);
	

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.Amazon.in/");
WebElement Signin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
Actions a1=new Actions(driver);
a1.moveToElement(Signin);
Signin.click();

WebElement Username=driver.findElement(By.xpath("//input[@id='ap_email']"));
Username.sendKeys(Un);// from 24line un is taken 

WebElement continuee=driver.findElement(By.xpath("//input[@id='continue']"));
continuee.click();

WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
password.sendKeys(pwd);// from 26th line password is taken 
	}
}
