package interviewPrepJava;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticingEverything {

	public static void main(String[] args) throws IOException
	{
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		WebElement img = driver.findElement(By.xpath("//img[@alt='Featured Destination: Aruba']"));
		
		/*TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);*/
		
		File src = img.getScreenshotAs(OutputType.FILE);
		
		File dest =  new File("/Users/anwaya/eclipse-workspace/SeleniumBasics/screenshots/testimage2.png");
		
		FileUtils.copyFile(src, dest);
	
		
		driver.quit();
		
		
		
		
	}

}
