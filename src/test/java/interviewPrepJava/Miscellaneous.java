package interviewPrepJava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Miscellaneous {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phptravels.net/admin/login.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@phptravels.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("demoadmin");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		WebElement booking = driver.findElement(By.xpath("//button[normalize-space()='Bookings']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", booking);
		
		List<WebElement> BookingOptions = driver.findElements(By.xpath("//li[@class='mb-0']//div[@id='bookings-collapse']//ul//li"));
		
		Thread.sleep(3000);
		
		for(WebElement opt:BookingOptions)
		{
			if(opt.getText().equals("Hotels Bookings"))
			{
				opt.click();
			}
		}
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement btn_search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/section/div[2]/div/div[2]/div/div[1]/div[3]/span/a")));
		 // = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='Search']")));
		
		 Actions act = new Actions(driver);
		 act.moveToElement(btn_search).build().perform();
		
		driver.findElement(By.xpath("//span[@aria-expanded='true']//b[@role='presentation']")).click();
		
		List<WebElement> status_options = driver.findElements(By.xpath("//ul[@class='select2-results__options']//li"));
		
		for(WebElement opti:status_options)
		{
			if(opti.getText().equals("Paid"))
			{
				opti.click();
			}
		}
		
	}

}
