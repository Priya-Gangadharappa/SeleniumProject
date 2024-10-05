package Groupin_Testcase;

import org.testng.annotations.Test;

public class Testcase_Grouping
{
@Test(groups= {"Smoke"})
public void testcase1()
{
	
}
@Test(groups= {"smoke,system"})
public void testcase2()
{
	
}
@Test(groups= {"system,Regression"})
public void testcase3()
{
	
}
@Test(groups= {"smoke,Regression"})
public void testcase4()
{
	
}
@Test(groups= {"integration"})
public void testcase5()
{
	
}
@Test(groups= {"component"})
public void testcase6()
{
	
}
}
