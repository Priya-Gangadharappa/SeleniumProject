package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment_DataDrivenTesting_Grotech
{
	WebDriver driver;
@Test(dataProvider="Data1")
public void Grotech(String Fname,String Lname,String Email,String Password,String PAddress,String PermanentAddress,String PinCode)
{
	driver=new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	WebElement FN=driver.findElement(By.xpath("//input[@id='fname']"));
	FN.sendKeys(Fname);
	WebElement LN=driver.findElement(By.xpath("//input[@id='lname']"));
	LN.sendKeys(Lname);
	WebElement EM=driver.findElement(By.xpath("//input[@id='email']"));
	EM.sendKeys(Email);
	WebElement Pwd=driver.findElement(By.xpath("//input[@id='password']"));
	Pwd.sendKeys(Password);
	WebElement PA=driver.findElement(By.xpath("//textarea[@id='Present-Address']"));
	PA.sendKeys(PAddress);
	WebElement PerA=driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));
	PerA.sendKeys(PermanentAddress);
	WebElement Pin=driver.findElement(By.xpath("//input[@id='Pincode']"));
	Pin.sendKeys(PinCode);
	
}
@DataProvider(name="Data1")
public Object[][] DataDriven() throws InterruptedException
{
	Object[][] o1=new Object[5][7];
	o1[0][0]="Priya";
	o1[0][1]="Gangadhar";
	o1[0][2]="Priyasgk95@gmail.com";
	o1[0][3]="Doctor@9496";
	o1[0][4]="present address1111";
	o1[0][5]="Permanent address1111";
	Thread.sleep(1000);
	o1[0][6]="560079";
	
	o1[1][0]="Ridhi";
	o1[1][1]="Suranayakanahalli";
	o1[1][2]="Ridhi2016@gmail.com";
	o1[1][3]="Cybatron@1390";
	o1[1][4]="present address2222";
	o1[1][5]="Permanent address2222";
	Thread.sleep(1000);
	o1[1][6]="560020";
	
	o1[2][0]="Rishi";
	o1[2][1]="Suranayakanahalli";
	o1[2][2]="Rishi2020@gmail.com";
	o1[2][3]="Cybatron@56778";
	o1[2][4]="present address3333";
	o1[2][5]="Permanent address3333";
	Thread.sleep(1000);
	o1[2][6]="560060";
	
	o1[3][0]="Mona";
	o1[3][1]="Swarba";
	o1[3][2]="Mona1390@gmail.com";
	o1[3][3]="Cybatron@0931";
	o1[3][4]="present address4444";
	o1[3][5]="Permanent address4444";
	Thread.sleep(1000);
	o1[3][6]="560091";
	
	o1[4][0]="Disha";
	o1[4][1]="Gulbarga";
	o1[4][2]="Disha1234@gmail.com";
	o1[4][3]="Empathy@0931";
	o1[4][4]="present address5555";
	o1[4][5]="Permanent address5555";
	Thread.sleep(1000);
	o1[4][6]="560067";
	return o1;
}

}
