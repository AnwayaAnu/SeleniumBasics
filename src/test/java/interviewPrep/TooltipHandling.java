package interviewPrep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TooltipHandling {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://practice.expandtesting.com/tooltips");
		driver.manage().window().maximize();
		
		WebElement tooltp = driver.findElement(By.xpath("//button[@id='btn1']"));
		System.out.println(tooltp.getAttribute("title"));
	}

}
