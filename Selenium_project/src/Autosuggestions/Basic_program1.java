package Autosuggestions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basic_program1 {
	
	@Test
	public void login_to_Amazon()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("httsp://www.Amazon.com");
	}

}
