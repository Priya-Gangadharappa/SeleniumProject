package testng_programs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderofExecution {

	
	@Test
	public void ABC()
	{
		System.out.println("Testcase1");
	}
	
	@Test
	public void bcd()
	{
		System.out.println("Testcase2");
	}
	@Test
	public void Cde()
	{
		System.out.println("Testcase3");
	}
}

