package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Absolute_learning_HTML
{
public static void main(String[] args) 
	{
		EdgeDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/priya/OneDrive/Documents/learningHTML1.html");
		WebElement un=driver.findElement(By.xpath("/html/body/input[1]"));
		un.sendKeys("Priya"+Keys.TAB);
		
		WebElement hnt=driver.findElement(By.xpath("/html/body/input[2]"));
		hnt.sendKeys("Gangadhar"+Keys.TAB);
		
		WebElement pwd=driver.findElement(By.xpath("/html/body/input[3]"));
		pwd.sendKeys("Cybatron@1390"+Keys.TAB);
		
		WebElement Fn=driver.findElement(By.xpath("/html/body/form/input[1]"));
		Fn.sendKeys("Priya");
		
		//WebElement Ln=driver.findElement(By.xpath("/html/body/form/input[2]"));
		//Ln.sendKeys("Gangadhar"+Keys.TAB);
		
		//WebElement Submit=driver.findElement(By.xpath("/html/body/form[1]/input[3]"));
//Submit.click();
		
		WebElement girl=driver.findElement(By.xpath("/html/body/form[2]/input[2]"));
		girl.click();
		
		WebElement gender=driver.findElement(By.xpath("/html/body/input[5]"));
		gender.click();
		
		WebElement bang=driver.findElement(By.xpath("/html/body/input[6]"));
		bang.click();
		
		WebElement relegion=driver.findElement(By.xpath("/html/body/select/option[1]"));
		relegion.click();
	}

}
