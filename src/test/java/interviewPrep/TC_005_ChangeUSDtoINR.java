package interviewPrep;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_005_ChangeUSDtoINR
{
	public WebDriver driver;
	@BeforeMethod
	@BeforeClass
	public void setUp() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phptravels.net/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("agent@phptravels.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("demoagent");
		driver.findElement(By.xpath("//button[@id='submitBTN']")).click();
		Thread.sleep(3000);
		
		boolean presence = driver.findElement(By.xpath("//div[@class='author-content']")).isDisplayed();
		
		AssertJUnit.assertEquals(presence, true);
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle btn px-0 ps-3 text-center d-flex align-items-center justify-content-center gap-1 waves-effect']//*[name()='svg']")).click();
	
		List<WebElement> currencies = driver.findElements(By.xpath("//ul[@class='dropdown-menu rounded-1 show']//li//a"));
	
		Thread.sleep(3000);
		for(WebElement cur:currencies)
		{
			if(cur.getText().equals("INR"))
			{
				cur.click();
			}
		}
		
		Thread.sleep(3000);

		boolean text = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/a/strong")).getText().equals("INR");
		Thread.sleep(3000);
		AssertJUnit.assertEquals(text, true);
		
	}
	@AfterMethod
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
