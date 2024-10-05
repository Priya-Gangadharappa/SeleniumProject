package TestNgPractice;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Logic1 implements IRetryAnalyzer

{
	int current_count=0;
	int No_of_Retry=2;
	
	public boolean retry(ITestResult result) 
	{
		if(current_count<No_of_Retry)
		{
			current_count++;
			return true;
		}
		return false;
	}

}
