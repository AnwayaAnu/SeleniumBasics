package interviewPrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practice.expandtesting.com/hovers");
		driver.manage().window().maximize();
		
		WebElement img1 = driver.findElement(By.xpath("//div[@class='container']//div[1]//img[1]"));
		Actions act = new Actions(driver);
		
		act.moveToElement(img1).perform();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
