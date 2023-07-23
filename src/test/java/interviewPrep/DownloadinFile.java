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
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword");
		profile.setPreference("browser.download.folderList",0); //0 - save to desktop, 1- save to download , 2 - save to preferred location
		//profile.setPreference("browser.download.dir", loc);
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://file-examples.com/index.php/sample-documents-download/");
		driver.manage().window().maximize();
		WebElement downld = driver.findElement(By.xpath("//a[@href='https://file-examples.com/index.php/sample-documents-download/sample-doc-download/']"));

		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", downld);
		
		driver.close();
	}

}
