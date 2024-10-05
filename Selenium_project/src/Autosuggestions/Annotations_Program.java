package Autosuggestions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Program 
{
	@Test
	public void testcase1()
	{
		System.out.println("Test");
	}
	@BeforeSuite
	public void bs()
	{
		System.out.println("bs");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("bt");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("bc");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("bm");
	}
}
