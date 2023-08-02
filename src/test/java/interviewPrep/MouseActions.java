package interviewPrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practice.expandtesting.com/drag-and-drop");
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.id("column-a"));
		WebElement trg = driver.findElement(By.id("column-b"));
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.clickAndHold(src).moveToElement(trg).release().build().perform();
		//act.dragAndDrop(src, trg).perform();
		
		
		Thread.sleep(3000);

		driver.close();
		
	}

}
