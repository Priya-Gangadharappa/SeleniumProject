package Day_47_uniqueScreenshot_Links;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Getcurrenttime_takescreenshot {

	public static void main(String[] args) throws IOException {
		Date d1=new Date(0);
		System.out.println(d1.getTime());
		
		Date d2=new Date(d1.getTime());
		String time=d2.toString();
		
	    System.out.println(time);
	    String Month=time.substring(4, 7);
	    System.out.println(Month);
	    
	
		TakesScreenshot driver = null;
		TakesScreenshot t1= driver;
	    File Source=t1.getScreenshotAs(OutputType.FILE);
	    File Destination=new File("C:\\Users\\priya\\OneDrive\\Desktop\\tech1"+new Getcurrenttime_takescreenshot().getClass()+".png");
	    FileHandler.copy(Source, Destination);
	    
	}

}
