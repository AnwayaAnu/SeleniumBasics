package interviewPrep;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ufile.io/");
		driver.manage().window().maximize();
		WebElement upload = driver.findElement(By.xpath("//div[@class='dz-message needsclick']"));

		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", upload);
		
		Robot rb = new Robot();
		
		StringSelection ss = new StringSelection("/Users/anwaya/Downloads/IMG_4581.jpg");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		///Users/anwaya/Downloads/IMG_4581.jpg
		
	}

}
