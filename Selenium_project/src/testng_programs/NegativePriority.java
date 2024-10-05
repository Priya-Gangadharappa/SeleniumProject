package testng_programs;

import org.testng.annotations.Test;

public class NegativePriority {
	@Test(priority=-1)
	public void Registration()
	{
		System.out.println("Priority 1 as Registration");
	}
	@Test(priority=0)  // Based on the priority execution will continue
	public void Login()
	{
		System.out.println("Priority 2 as Login");
	}
	@Test(priority=1)
	public void Logout()
	{
		System.out.println("Priority 3 as Logout");
	}
	@Test(priority=2)
	public void reRegistration()
	{
		System.out.println("Priority 4 as reRegistration");
	}
}
