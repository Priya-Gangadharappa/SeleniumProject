package Selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class prog10_Amazon_bestsellers_Partiallinktext {

	public static void main(String[] args) {
EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Sellers")).click();
		
		
	}

}
