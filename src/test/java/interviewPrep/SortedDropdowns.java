package interviewPrep;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedDropdowns {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		
		WebElement drp = driver.findElement(By.xpath("//select[@id='elementsPerPageSelect']"));
		Select drpOptions = new Select(drp);
		List<WebElement> options = drpOptions.getOptions();
		
		ArrayList originalList = new ArrayList();
		ArrayList tempList = new ArrayList();
		
		for(WebElement opt:options)
		{
			originalList.add(opt.getText());
			tempList.add(opt.getText());
			
		}
		
		System.out.println("Before sorting");
		System.out.println("original list" +originalList);
		System.out.println("Tem list"+tempList);
		
		Collections.sort(tempList);
		
		System.out.println("After sorting");

		System.out.println("original list" +originalList);

		System.out.println("Tem list"+tempList);
		
		if(originalList.equals(tempList))
		{
			System.out.println("Options are sorted");
			
		}
		else
		{
			System.out.println("Options are unsorted");
		}
		
		driver.quit();
	}

}
