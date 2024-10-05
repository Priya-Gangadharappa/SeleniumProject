package FB_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import FB_Source.FB_Registration;

public class Registration_On_Facebook 
{
	
	@Test
	public void Registration()
	{
//login page-click on new account
//Registration Page
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	FB_Registration r1=new FB_Registration(driver);
	r1.create();
	r1.Firstname();
	r1.surname();
	r1.email();
	r1.gender();
	r1.pwd();
	r1.signup();
	}
}
