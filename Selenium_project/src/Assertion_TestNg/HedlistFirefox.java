package Assertion_TestNg;

import org.openqa.selenium.firefox.FirefoxOptions;

public class HedlistFirefox {
	public static void main(String[] args) {
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--headless");
	}

}
