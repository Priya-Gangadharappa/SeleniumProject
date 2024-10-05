package testng_programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg1 {
	@Test
	public void testcase1()
	{
		System.out.println("Testcase");
	}
@BeforeSuite
public void bs()
{
	System.out.println("befores suite");
}
@BeforeTest
public void Bt()
{
	System.out.println("Before test");
}
@BeforeClass
public void Bc()
{
	System.out.println("Before class");
}
@BeforeMethod
public void Bm()
{
	System.out.println("Before Method");
}

@AfterMethod
public void Am1()
{
	System.out.println("After Method");
}
@AfterClass
public void Ac1()
{
	System.out.println("After Class");
}
@AfterTest
public void At1()
{
	System.out.println("After Test");
}
@AfterSuite
public void As1()
{
	System.out.println("After Suite");
}
}
