package DataDrivenTesting;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataDrivenTesting1 
{
	@Test(dataProvider="data1")
	public void method1(int input)
	{
		System.out.println(input);
	}
	@DataProvider(name="data1")
	public Object[][] datainput()
	{
		return new Object[][] {{14},{21},{56},{19},{7}};
	}
}
