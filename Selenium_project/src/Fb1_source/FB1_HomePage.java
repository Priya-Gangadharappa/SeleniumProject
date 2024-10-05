package Fb1_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB1_HomePage 
{
	WebDriver driver;
@FindBy(xpath="//input[@className='x1i10hfl xggy1nq x1s07b3s x1kdt53j x1yc453h xhb22t3 xb5gni xcj1dhv x2s2ed0 xq33zhf xjyslct xjbqb8w xnwf7zb x40j3uw x1s7lred x15gyhx8 x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xzsf02u xdl72j9 x1iyjqo2 xs83m0k xjb2p0i x6prxxf xeuugli x1a2a7pz x1n2onr6 x15h3p50 xdvlbce x1sxyh0 xurb0ha xm7lytj x1vqgdyp x1xtgk1k x17hph69 xo6swyp x1ad04t7 x1glnyev x1ix68h3 x19gujb8']")
WebElement SearchFriend;

public void search()
{
	SearchFriend.sendKeys("PriyaGangadhar"+Keys.ENTER);
}

public FB1_HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
