package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting_Intvalue53class 
{
	
@Test(dataProvider="Data1")
public void Integer(int Input)
{
	System.out.println(Input);
}
@DataProvider(name="Data1")
public Object[][] DataDriven()
{
	return new Object[][] {{24},{48},{82},{102},{188}};
	
}
}
