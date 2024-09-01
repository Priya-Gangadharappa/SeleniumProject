package Tagname_mousefxn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Prog12_learininghtml {

	public static void main(String[] args) {
		EdgeDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/priya/OneDrive/Documents/learningHTML1.html");
        WebElement e1=driver.findElement(By.tagName("a"));
        e1.click();
	}

}
