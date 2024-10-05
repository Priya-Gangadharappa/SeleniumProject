package Css_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_className_AN_AV {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement Searchtab=driver.findElement(By.cssSelector("textarea.gLFyf[name='q']"));
		Searchtab.sendKeys("Bangalore"+Keys.ENTER);
		
	}

}
