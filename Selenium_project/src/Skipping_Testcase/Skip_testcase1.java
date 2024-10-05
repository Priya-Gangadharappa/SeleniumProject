package Skipping_Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Skip_testcase1
{
@Test
public void login()
{
	Assert.assertEquals(0, 10);//Purposefully failed for skipping the tetscase
}
@Test(dependsOnMethods="login")
public void logout()
{
	
}
}
