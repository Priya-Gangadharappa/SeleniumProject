package Practice1;

import org.testng.annotations.Test;

public class invocationcount {
	@Test(invocationCount=10)
	public void testcase1()
	{
		System.out.println("1");		
    }

}
