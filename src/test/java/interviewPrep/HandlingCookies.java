package interviewPrep;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingCookies {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		while(true)
		{
			String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String year =  driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(month.equals("August") && year.equals("2023"))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		for(WebElement dys:days)
		{
			if(dys.getText().equals("5"))
			{
				dys.click();
			}
		}
		
		driver.close();
		
	}

}
