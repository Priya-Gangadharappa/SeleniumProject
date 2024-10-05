package Practice1;

import org.testng.annotations.Test;

public class Invocation_priority 
{
@Test(invocationCount=5,priority=2)
public void testcase1() {
	
	System.out.println("1");
}
@Test
public void testcase2()
{
	System.out.println("2");
}
}
