package Fb1_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB1_LoginPage 
{
	WebDriver driver;
	   //step 1
		@FindBy(id="email")
		WebElement Username;
		
		@FindBy(name="pass")
		WebElement Password;
		
		@FindBy(xpath="//button[@name='login']")
		WebElement Login_Button;
		
		//@FindBy(xpath="//a[.='Create new account']")
		//WebElement CreateNewAccount;
		
		//Step 2
		public void UN()
		{
			Username.sendKeys("7411088304");
		}
		
		public void Pwd()
		{
			Password.sendKeys("Doctor@9496");
		}
		
		public void Login()
		{
			Login_Button.click();
		}
		
		public void newAccount()
		{
			CreateNewAccount.click();
		}
		//step3
		
		public FB1_LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
}
