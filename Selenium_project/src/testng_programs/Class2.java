package testng_programs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class2 {
	@BeforeMethod
	public void Bm()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void testcase1()
	{
		System.out.println("Testcase1");
	}
	@AfterMethod
	public void Am1()
	{
		System.out.println("After Method");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("Testcase2");
	}
	@Test
	public void testcase3()
	{
		System.out.println("Testcase3");
	}
}
