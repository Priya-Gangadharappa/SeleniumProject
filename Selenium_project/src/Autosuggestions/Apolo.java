package Autosuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apolo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apollopharmacy.in/");
        WebElement e1=driver.findElement(By.xpath("//div[@class='SearchPlaceholder_searchRoot__LWDXI icon-searchIcon SearchPlaceholder_icon___bJlq']"));
        e1.click();
        WebElement e2=driver.findElement(By.xpath("//input[@id='searchProduct']"));
        e2.sendKeys("Dolo"+Keys.ENTER);
        
        
        
        
	}

}
