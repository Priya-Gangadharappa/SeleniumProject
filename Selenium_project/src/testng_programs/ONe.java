package testng_programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class ONe 
{
	@Test
	public void login_to_amazon()
	{
		EdgeDriver driver=new EdgeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.in/s?k=shoe&crid=M7W8TTI8HYUN&sprefix=shoe%2Caps%2C1215&ref=nb_sb_noss_2");
		  
		//WebElement un=  driver.findElement(By.name("email"));
		
	}
}
