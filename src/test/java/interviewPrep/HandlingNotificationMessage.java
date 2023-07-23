package interviewPrep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingNotificationMessage {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://practice.expandtesting.com/notification-message-rendered");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Click here']")).click();
		
		Thread.sleep(3000);
		
		String txt = driver.findElement(By.xpath("//div[@id='flash']")).getText();
		
		System.out.println(txt);
		
		driver.close();
		
	}

}
