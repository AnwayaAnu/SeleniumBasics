package interviewPrep;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException 
	{
		int count = 0;
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> tot_links = driver.findElements(By.tagName("a"));
		
		for(WebElement lnks:tot_links)
		{
			String link = lnks.getAttribute("href");
			
			if(link.equals(null) || link.isEmpty())
			{
				System.out.println("Links are not present");
			}
			
			URL urls = new URL(link);
			
			HttpURLConnection hcon = (HttpURLConnection) urls.openConnection();
			
			hcon.connect();
			
			if(hcon.getResponseCode()<400)
			{
				System.out.println("Valid links");
			}
			else
			{
				System.out.println("Invalid links");
				count++;		
			}
		}
		System.out.println("Total no. of invalid links:"+ "="+count);
		
		driver.quit();
		
	}

}
