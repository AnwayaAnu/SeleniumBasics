package PracticeProblems;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoTable {

	public static void main(String[] args) throws InterruptedException 
	{
		int sum =0;
		int tot=0;
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		for(int p=1;p<=4;p++)
		{
			if(p>1)
			{
				driver.findElement(By.xpath("//a[normalize-space()="+p+"]")).click();
				break;
			}
			
			int row = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			
			for(int r=2;r<=row;r++)
			{
				String name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[2]")).getText();
				String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[3]")).getText();
				
				System.out.println(name +" " +price);
			}
		}
		
		
		
		driver.quit();
		
		
		
	}

}
