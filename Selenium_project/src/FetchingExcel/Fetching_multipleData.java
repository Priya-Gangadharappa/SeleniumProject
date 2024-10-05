package FetchingExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Fetching_multipleData
{
static String Un;
static String pwd;
	
	public void multidata() throws EncryptedDocumentException, IOException
	{
	FileInputStream f1=new FileInputStream("C:\\Users\\priya\\eclipse-workspace\\Selenium_project\\DataFetching\\PriyaSheet.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	
	for(int i=1,k=1;i<=7;i++,k++)
	{
	Un=w1.getSheet("Login_Details").getRow(i).getCell(0).getStringCellValue();	
	pwd=w1.getSheet("Login_Details").getRow(k).getCell(1).getStringCellValue();
	
	}
	System.out.println(Un);
	System.out.println(pwd);
	
	}
}
