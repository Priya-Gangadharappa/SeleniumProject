package Assertion_TestNg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NaukriSigin {
	@Test
	public void NaukriRegistartion()
	{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMIsNGwsaHUiAMVi6NmAh1HXDxREAAYASAAEgK0__D_BwE&gclsrc=aw.ds");
	WebElement GoogleButton=driver.findElement(By.xpath("//span[.='Google']"));
	GoogleButton.click();
	
	Set<String> s1=driver.getWindowHandles();
	System.out.println(s1);
	
	//driver.close();//parent window will be closed which has the control
	Iterator<String> i1=s1.iterator();
	String Prentid=i1.next();
	String childid=i1.next();
	
	System.out.println(Prentid);
	System.out.println(childid);
	driver.switchTo().window(childid);
	WebElement Search=driver.findElement(By.xpath("//div[@class='rFrNMe X3mtXb UOsO2 ToAxb zKHdkd sdJrJc Tyc9J']"));
	
	Assert.assertFalse(Search.isEnabled(),"Sorry");
	}
	}


