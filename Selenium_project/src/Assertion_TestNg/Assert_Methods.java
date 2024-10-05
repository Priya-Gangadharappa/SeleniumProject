package Assertion_TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Methods
{
private static final Object Flase = null;
private static final Object True = null;

@Test
public void Testcase()
{
	Assert.assertEquals(2, 2); // test case will be pass
	
	Assert.assertEquals(0, 0);
	
	Assert.assertEquals(True, Flase , "Sorry test case is fail");
}
}
