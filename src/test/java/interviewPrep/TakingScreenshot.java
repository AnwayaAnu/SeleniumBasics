package interviewPrep;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TakingScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		TakesScreenshot tscreen = (TakesScreenshot) driver;
		
		File src = tscreen.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir")+"/downloads/test.png");
		
		FileUtils.copyFile(src, dest);
		
		
		//copying a file
		
		try
		{
		
		StringSelection ss = new StringSelection(System.getProperty("user.dir")+"/downloads/test.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		driver.get("https://pasteboard.co/");
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(4000);
		driver.close();
		
		
		
	}

}
