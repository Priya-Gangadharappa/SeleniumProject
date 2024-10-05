package Autosuggestions;

import org.testng.annotations.Test;

public class TestNG_Annottaions 
{

	@Test
	public void login()
	{
		System.out.println("login");
		
	}
	@Test(priority=-1)
	public void registartion()
	{
		System.out.println("registartion");
		
	}
	@Test(priority=3)
	public void logout()
	{
		System.out.println("logout");
	}
	
}
