package interviewPrep;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class Demotestng
{
	WebDriver driver;
	@BeforeMethod
	@BeforeClass
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
	}
	
	@Parameters("text")
	@Test
	public void search(String txt)
	{
		driver.findElement(By.xpath("//div[@class='a4bIc']")).sendKeys(txt);
		Actions act = new Actions(driver);
		act.keyDown(Keys.ENTER).perform();
		act.keyUp(Keys.ENTER).perform();
	}


}
