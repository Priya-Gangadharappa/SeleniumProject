package Fb1_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Fb1_source.FB1_HomePage;
import Fb1_source.FB1_LoginPage;
import Fb1_source.FB1_SelectProfile;

public class Search_A_Friend
{
	@Test
	public void Login()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	FB1_LoginPage Lgpg=new FB1_LoginPage(driver);
	Lgpg.UN();
	Lgpg.Pwd();
	Lgpg.Login();
	//Lgpg.newAccount();
	
	FB1_HomePage h1=new FB1_HomePage(driver);
	h1.search();
	
	FB1_SelectProfile s1=new FB1_SelectProfile(driver);
	s1.selectProf();
	
}
}
