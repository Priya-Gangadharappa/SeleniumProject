package FetchingExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.Test;

public class convert_Number_toText {
	@Test
	public void login() throws EncryptedDocumentException, IOException
	{
	FileInputStream f1=new FileInputStream("C:\\Users\\priya\\eclipse-workspace\\Selenium_project\\DataFetching\\PriyaSheet.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	String Un=w1.getSheet("Login_Details").getRow(1).getCell(0).getStringCellValue();
	System.out.println(Un);
	
	//String pwd=NumberToTextConverter.toText(w1.getSheet("Login_Details").getRow(1).getCell(1).getNumericCellValue());
	String pwd=w1.getSheet("Login_Details").getRow(1).getCell(1).getStringCellValue();
	System.out.println(pwd);
	}
}
