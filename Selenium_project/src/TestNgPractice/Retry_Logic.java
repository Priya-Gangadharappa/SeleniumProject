package TestNgPractice;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class Retry_Logic implements IRetryAnalyzer
{
	int current_count=0;
	int noofretry=1;
	@Override
	public boolean retry(ITestResult result) 
	{
		if(current_count<noofretry)
		{
			current_count++;
			return true; //give retry
		}
		return false;//don't retry
	}
	

}
