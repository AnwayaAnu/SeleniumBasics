package interviewPrep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeyboardActions {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practice.expandtesting.com/key-presses");
		driver.manage().window().maximize();
		
		WebElement img1 = driver.findElement(By.xpath("//input[@id='target']"));
	//	img1.sendKeys("k");
		
		Actions act = new Actions(driver);
		//act.keyDown(img1, "K").keyUp(img1, "K").perform();
		img1.click();
		
		act.keyDown(Keys.TAB).keyUp(Keys.SHIFT).perform();
		
		driver.close();
	}

}
