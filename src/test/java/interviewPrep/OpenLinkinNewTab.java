package interviewPrep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenLinkinNewTab {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://practice.expandtesting.com/redirector");
		driver.manage().window().maximize();
		
		String tab = Keys.chord(Keys.COMMAND, Keys.RETURN);
		driver.findElement(By.xpath("//a[@id='redirect']")).sendKeys(tab);
		
		//driver.close();
	}

}






















