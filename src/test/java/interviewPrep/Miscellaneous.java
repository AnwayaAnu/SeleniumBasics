package interviewPrep;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Miscellaneous {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement registration = driver.findElement(By.xpath("//a[text()='Register']"));
		
		registration.click();
		
		
		//WebElement drp = driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
		
		Select st = new Select(driver.findElement(By.name("DateOfBirthDay")));
		//st.selectByVisibleText("4");
		
		 
		WebElement drp = driver.findElement(By.name("DateOfBirthDay"));
		
		List<WebElement> drps = st.getOptions();
		
		for(WebElement options:drps)
		{
			if(options.getText().equals("4"))
			{
				options.click();
			}
		}
		
		driver.quit();
		
		
	}

}
