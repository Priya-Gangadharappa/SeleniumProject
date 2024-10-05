package Autosuggestions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations 
{
	@BeforeMethod
	public void bm()
	{
		System.out.println("bm");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("am");
	}
	@Test
	public void testcase1()
	{
		System.out.println("Test");
	}
	@Test
	public void testcase2()
	{
		System.out.println("Test");
	}
	@Test
	public void testcase3()
	{
		System.out.println("Test");
	}
}
