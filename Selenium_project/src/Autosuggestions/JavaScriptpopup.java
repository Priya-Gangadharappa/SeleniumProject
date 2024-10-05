package Autosuggestions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScriptpopup
{
public static void main(String[] args) {
	
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/priya/OneDrive/Documents/learningHTML1.html");
String a=	driver.switchTo().alert().getText();
System.out.println(a);
driver.switchTo().alert().dismiss();

WebElement e1=driver.findElement(By.id("1"));
e1.sendKeys("Manish");
}
}
