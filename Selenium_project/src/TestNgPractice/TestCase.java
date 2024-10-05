package TestNgPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestCase 
{
	WebDriver driver;
	@Test(retryAnalyzer=TestNgPractice.Retry_Logic.class)
	public void login_to_amazon()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in/");
//		WebElement e1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement e1=driver.findElement(By.xpath("//output[@id='twotabsearchtextbox']"));
		e1.sendKeys("mobiles"+Keys.ENTER);		
	}
}
