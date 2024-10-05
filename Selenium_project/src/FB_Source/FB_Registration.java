package FB_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Registration
{
	WebDriver driver;
	
//step1
	
	@FindBy(xpath="//a[.='Create new account']")
	WebElement createNewAccount;
	
	@FindBy(id="u_3_8_2J")
	WebElement FirstName;
	
	@FindBy(className="inputtext _58mg _5dba _2ph-")
	WebElement surname;
	
	@FindBy(id="u_3_d_PL")
	WebElement Email;
	
	@FindBy(id="password_step_input")
	WebElement Password;
	
	@FindBy(xpath="//label[.='Female']")
	WebElement Gender;
	
	@FindBy(id="u_3_n_qx")
	WebElement SignUp;
	
	//step2
	public void create()
	{
		createNewAccount.click();
	}
	
	public void Firstname()
	{
		FirstName.sendKeys("Rishi");
	}
	public void surname()
	{
		surname.sendKeys("sunak");
	}
	public void email()
	{
		Email.sendKeys("Rishi@gmail.com");
	}
	public void pwd()
	{
		Password.sendKeys("sunak123");
	}
	
	public void gender()
	{
		Gender.click();
	}
	public void signup()
	{
		SignUp.click();
	}
	
	//step3
	
	public FB_Registration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
