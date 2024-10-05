package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Amazon {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in/");
		WebElement e1=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s1=new Select(e1);
		//s1.selectByValue("search-alias=baby");
		//s1.selectByIndex(9);
		s1.selectByVisibleText("Baby");
	}
}
