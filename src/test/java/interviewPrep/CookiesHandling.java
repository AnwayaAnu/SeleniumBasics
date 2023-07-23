package interviewPrep;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookiesHandling {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		Set<Cookie> cookies = driver.manage().getCookies(); // getcookies() method will return a set of cookies 
		
		System.out.println("Total no of cokkoies: " +cookies.size());
		
		for(Cookie cooki:cookies)
		{
			System.out.println(cooki.getName()+"--------"+cooki.getValue()); // reading cookie name and it's value

		}
		
		Cookie cookies_obj = new Cookie("My new cookie", "My-new-cookie-value54321"); // create a cookie object by passing cookie name and value
		
		driver.manage().addCookie(cookies_obj); // addCookie by passing the object created
        cookies = driver.manage().getCookies();
		
		System.out.println("Total no of cookies after adding one more cookie: " +cookies.size());
		
		driver.manage().deleteCookie(cookies_obj); // deleting cookie by passing the cookie object
		cookies = driver.manage().getCookies();
			
		System.out.println("Total no of cookies after deleting one cookie: " +cookies.size());
		
		driver.manage().deleteCookieNamed("My new cookie"); // deleting cookie by passing the cookie's name
		cookies = driver.manage().getCookies();
		
		driver.manage().deleteAllCookies(); // this will delete all cookies
		
		driver.close();
		
		
	}

}
