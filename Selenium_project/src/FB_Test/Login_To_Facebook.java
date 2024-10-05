package FB_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Test;

import FB_Source.FB_LoginPage;

public class Login_To_Facebook
{
@Test
public void login_with_correct_credential()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	FB_LoginPage Lgpg=new FB_LoginPage(driver);
	Lgpg.UN();
	Lgpg.Pwd();
	Lgpg.Login();
	
	
}
}
