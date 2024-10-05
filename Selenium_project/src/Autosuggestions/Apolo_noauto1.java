package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apolo_noauto1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.apollopharmacy.in");
		
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.className("SearchPlaceholder_searchRoot__LWDXI icon-searchIcon SearchPlaceholder_icon___bJlq"));
        
		e1.sendKeys("Dolo-650"+Keys.ENTER);
		
		
		ChromeDriver driver1 = new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/");
		driver.manage().window().maximize();
		
		WebElement searchinitial=driver.findElement(By.xpath("//div[@class='SearchPlaceholder_searchRoot__LWDXI icon-searchIcon SearchPlaceholder_icon___bJlq']"));
		searchinitial.click();
		WebElement searchFinal=driver.findElement(By.xpath("//input[@id='searchProduct']"));
		Thread.sleep(2000);
		searchFinal.sendKeys("PCM");
		
		Thread.sleep(2000);
		
		List<WebElement> pro=driver.findElements(By.xpath("//div[@class='MedicineAutoSearch_searchList___m_g7 null']/ul/li"));
		System.out.println(pro.size());
		Thread.sleep(3000);
		pro.get(2).click();
	}

}
