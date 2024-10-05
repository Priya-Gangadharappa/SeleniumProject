package Amazon_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Source
{
	WebDriver driver;
@FindBy(xpath="//a[@class='nav-a nav-a-2   nav-progressive-attribute']")
WebElement HelloSignin;



public void Hello_Signin()
{
	Actions a1=new Actions(driver);
	a1.moveToElement(HelloSignin).perform();
	HelloSignin.click();
}

public Registration_Source(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}


