package interviewPrep;

import java.sql.Connection;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JDBCDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")).click();
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Anna");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Doe");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("annadoe@yopmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("7886654556");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		/*
		Connection con =  WebDriverManager.getConnection("Connection string");
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from students");
		*/
		
	}

}
