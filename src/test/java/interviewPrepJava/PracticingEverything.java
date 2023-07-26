package interviewPrepJava;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class PracticingEverything {

	WebDriver driver;
		@BeforeClass
		public void setUp()
		{
			driver = new ChromeDriver();
		
			driver.get("https://nguat.mysutra.life/user/login");
			driver.manage().window().maximize();
		}
		
		@Test(dataProvider = "logindata")
		public void LoginTest(String email, String pwd) throws InterruptedException
		{
			WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
			uname.clear();
			uname.sendKeys(email);
			
			WebElement pw = driver.findElement(By.xpath("//input[@type='password']"));
			pw.clear();
			pw.sendKeys(pwd);
			
			WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Login To Life']"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", login);
			
			Thread.sleep(3000);
			
			WebElement mycore = driver.findElement(By.xpath("//div[normalize-space()='MyLifemates']"));
			
			boolean stat = mycore.isDisplayed();
			
			Assert.assertEquals(stat, true);
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//img[@src='https://mslprodstorage.blob.core.windows.net/msl/icons/carat.png']")).click();
		
			WebElement logout = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
			js.executeScript("arguments[0].click();", logout);
			Thread.sleep(3000);
		}
		
		@AfterClass
		public void tearDown()
		{
			driver.quit();
		}
		
		
		
		
		
		

}
