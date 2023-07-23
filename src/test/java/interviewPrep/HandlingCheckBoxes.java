package interviewPrep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		
		WebElement ele = driver.findElement(By.xpath("//div[normalize-space()='CheckBox & Radio Button practice']"));
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		/*
		// Clicking on specific checkbox
		
		driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		
		// Clicking all the checkboxes
		
		List<WebElement> days = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		
		for(WebElement dy:days)
		{
			dy.click();
		}
		*/
		
		// Clicking checkboxes based on choice
		
        List<WebElement> days = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		
		for(WebElement dy:days)
		{
			String dayName = dy.getAttribute("id");
			
			System.out.println(dayName);
			
			if((dayName.equals("monday")) || (dayName.equals("friday")))
			{
				dy.click();
			}
			
		}
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
