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
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException 
	{
		
		
		int count = 0;
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement lnk:links)
		{
			String link_attr = lnk.getAttribute("href");
			
			if(link_attr==null || link_attr.isEmpty())
			{
				System.out.println("Invalid urls");
				continue;
			}
			try
			{
			URL urls = new URL(link_attr);
			
			HttpURLConnection hcon = (HttpURLConnection) urls.openConnection();
			hcon.connect();
			
			if(hcon.getResponseCode()>400)
			{
				System.out.println("Broken URl");
				count++;
			}
			else
			{
				System.out.println("valid URL");
			}
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

		}
		System.out.println("total no of broken urls: "+count);
		
	}

}
