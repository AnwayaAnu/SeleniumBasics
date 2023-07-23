package interviewPrep;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindows {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practice.expandtesting.com/windows");
		driver.manage().window().maximize();
		
		WebElement img1 = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
		img1.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String winid:windowHandles)
		{
			
			String title = driver.switchTo().window(winid).getTitle();
			
			if(title.equals("Example of a new window"))
			{
				driver.close();
			}
		}
		
		//driver.quit();
	}

}
