package testng_programs;

import org.testng.annotations.Test;

public class Orderofexecution1 {
	@Test
	public void Testcase1()
	{
		System.out.println("1"); // it will execute according to the Alphabetical order
	}
	@Test
	public void Testcase2()
	{
		System.out.println("2");
	}

}
