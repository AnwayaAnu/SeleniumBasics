package PracticeProblems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Navigations {

	public static void main(String[] args) 
	{
		RemoteWebDriver driver = new FirefoxDriver();
		
		driver.get("https://snapdeal.com/");
		
		driver.navigate().to("https://amazon.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
	}

}
