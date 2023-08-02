package interviewPrep;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadinFile {

	public static void main(String[] args) throws InterruptedException 
	{
		
		String loc = System.getProperty("user.dir")+"/downloads/";
		/*
		HashMap preferences = new HashMap();
		
		preferences.put("download.default_directory", loc);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		*/
		
		HashMap preference = new HashMap();
		
		preference.put("download.default_directpry", loc);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preference);
	
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@type='button']")).click();
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
