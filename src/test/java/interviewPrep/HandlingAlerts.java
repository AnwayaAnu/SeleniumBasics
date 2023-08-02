package interviewPrep;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Alert alt = driver.switchTo().alert();
		/*
		alt.sendKeys("Hello");
		alt.accept();*/
		System.out.println(alt.getText());
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}
}
