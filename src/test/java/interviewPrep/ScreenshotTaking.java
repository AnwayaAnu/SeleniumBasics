package interviewPrep;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotTaking {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sr = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("/Users/anwaya/eclipse-workspace/SeleniumBasics/screenshots/testimage1.png");
		FileUtils.copyFile(sr, dest);
		WebElement sect = driver.findElement(By.xpath("//img[@alt='Featured Destination: Aruba']"));
		File sorce = sect.getScreenshotAs(OutputType.FILE);
		File destin = new File("/Users/anwaya/eclipse-workspace/SeleniumBasics/screenshots/testimage2.png");
		FileUtils.copyFile(sorce, destin);
	}

}
