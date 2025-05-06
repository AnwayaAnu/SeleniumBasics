package PracticeProblems;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//OrangeHRM
//Human Resources Management Software | OrangeHRM

public class Practice {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		// Capture cookies from the browser
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		System.out.println("Size of cookies" +cookies.size());
		
		for(Cookie txt:cookies)
		{
			System.out.println(txt.getName()+ " " +txt.getValue());
		}
		
		Cookie cook = new Cookie("MyCookies", "cook1234");
		
		driver.manage().addCookie(cook);
		
		System.out.println("Size of cookies" +cookies.size());
		
		driver.manage().deleteCookie(cook);
		
		System.out.println("Size of cookies" +cookies.size());
		
		driver.quit();

	}

}
