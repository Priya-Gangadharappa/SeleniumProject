package FetchingExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	@Test(dataProvider="Data1" )
	public void Facebook(String un,String pwd)
	{
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement UserName=driver.findElement(By.xpath("//input[@id='email']"));
UserName.sendKeys(un+Keys.TAB);
WebElement Password=driver.findElement(By.xpath("//input[@id='pass']"));
Password.sendKeys(pwd+Keys.TAB);
WebElement Login=driver.findElement(By.xpath("//button[@name='login']"));
Login.click();
	}
	@DataProvider(name="Data1")
	public Object[][] DataDriven1() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\priya\\eclipse-workspace\\Selenium_project\\DataFetching\\PriyaSheet.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String Un1=w1.getSheet("Login_Details").getRow(1).getCell(0).getStringCellValue();
		//System.out.println(Un);
		String pwd1=w1.getSheet("Login_Details").getRow(1).getCell(1).getStringCellValue();
		String Un2=w1.getSheet("Login_Details").getRow(2).getCell(0).getStringCellValue();
		String pwd2=w1.getSheet("Login_Details").getRow(2).getCell(1).getStringCellValue();
		//System.out.println(pwd);
		
		
		Object[][] D1=new Object[2][2];
		//1St Row
		D1[0][0]=Un1;
		D1[0][1]=pwd1;
		//2nd row
		D1[1][0]=Un2;
		D1[1][1]=pwd2;
		return D1;		
		
		
	}
}

