package FetchingExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class FetchExcellValueFromExcell
{
@Test
public void values() throws EncryptedDocumentException, IOException 
{
	//FileInputStream f1=new FileInputStream("C:\\Users\\priya\\eclipse-workspace\\Selenium_project\\DataFetching\\PriyaSheet.xlsx");
	FileInputStream f1=new FileInputStream("D:\\Users\\priya\\eclipse-workspace\\Selenium_project\\DataFetching\\PriyaSheet.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	Sheet s1= w1.getSheet("Login_Details");
	Row r1= s1.getRow(1);
	Cell c1=r1.getCell(0);
	String UserName=c1.getStringCellValue();
	System.out.println(UserName);

	
}


}
