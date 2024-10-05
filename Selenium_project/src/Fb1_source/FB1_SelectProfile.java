package Fb1_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB1_SelectProfile
{
 WebDriver driver;
 @FindBy(css="image[preserveAspectRatio^='xMidYMid slice']")
 WebElement Select_Profile;


public void selectProf()
{
	Select_Profile.click();
}

public FB1_SelectProfile(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}