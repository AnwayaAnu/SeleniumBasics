package interviewPrep;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		
		
		int rows = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr")).size();
		int cols = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[2]//td")).size();
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=0;j<=cols;j++)
			{
				List<WebElement> table_contents = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr["+i+"]/td["+j+"]"));
				for(WebElement cont:table_contents)
				{
					System.out.print(cont.getText()+" ");
				}
				
			}
			
			System.out.println(" ");
		}
		
		driver.close();
	}

}
