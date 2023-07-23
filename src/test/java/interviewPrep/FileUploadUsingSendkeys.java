package interviewPrep;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadUsingSendkeys {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().window().maximize();
		
		//Usinf sendkeys method
		
		WebElement img1 = driver.findElement(By.id("fileInput"));
		//img1.sendKeys("/Users/anwaya/Downloads/user.jpeg");
		
		Thread.sleep(3000);
		
		//Usinf robot class
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", img1);
		
		Robot rb = new Robot();
		
		StringSelection ss = new StringSelection("/Users/anwaya/Downloads/IMG_4581.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(3000);

		driver.close();
	}

}
