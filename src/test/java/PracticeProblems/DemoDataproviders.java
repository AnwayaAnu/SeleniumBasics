package PracticeProblems;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DemoDataproviders 
{
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setUp(String br)
	{
		
		switch(br.toLowerCase())
		{
		case "chrome" : driver = new ChromeDriver();break;
		case "edge" : driver = new SafariDriver(); break;
		case "firefox" : driver = new FirefoxDriver(); break;
		default : System.out.println("Invalid browser"); return;
		}
		
		
		//driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="dp")
	void Login(String uname, String pw)
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pw);
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		boolean status = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
		
		if(status==true)
		{
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
			AssertJUnit.assertTrue(true);
		}
		else
		{
			AssertJUnit.fail();
		}
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	
	@DataProvider(name = "dp", indices = {0})
	Object[][] generateData()
	{
		Object[][] data = { 
							{"Admin","admin123"},
							{"Adminn","admin234"},
							{"anu","ammu"},
							{"xyzabd","tttt"}
				
						   };
		
		return data;
	}
}
