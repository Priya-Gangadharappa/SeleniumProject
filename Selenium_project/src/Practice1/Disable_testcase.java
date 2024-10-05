package Practice1;

import org.testng.annotations.Test;

public class Disable_testcase 
{
@Test(invocationCount=10)
public void testcase1()
{
	System.out.println("1");
}
@Test(enabled=false)
public void testcase2()
{
	System.out.println("2");
}
}
