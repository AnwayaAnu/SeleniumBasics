package interviewPrep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingSizeofWebElement {

	public static void main(String[] args) throws InterruptedException 
	{WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	WebElement Google = driver.findElement(By.xpath("//img[@alt='Google']"));
	
	Dimension dim = Google.getSize();
	System.out.println(dim.getHeight()+"________" +dim.getWidth());
	
	
	Thread.sleep(3000);
	
	driver.quit();
	}

}
