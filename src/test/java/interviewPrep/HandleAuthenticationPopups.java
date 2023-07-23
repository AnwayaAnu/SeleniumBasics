package interviewPrep;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAuthenticationPopups {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://admin:admin@practice.expandtesting.com/basic-auth");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.close();
	}

}
