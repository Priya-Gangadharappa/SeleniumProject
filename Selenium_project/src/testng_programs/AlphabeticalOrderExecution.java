package testng_programs;

import org.testng.annotations.Test;

public class AlphabeticalOrderExecution {
	@Test
	public void Login()
	{
		System.out.println("Login");
	}
    @Test
    public void Registration()
    {
    	System.out.println("Registration");
    }
    @Test
    public void Logout()
    {
    	System.out.println("Logout");
    }
}
