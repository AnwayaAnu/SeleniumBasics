package interviewPrepJava;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreen 
{
	WebDriver driver;
	public String captureScreenshot(String tname) throws IOException
	{
		Date dt = new Date();
		SimpleDateFormat sp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss");
		String timestamp = sp.format(dt);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		String dest = System.getProperty("user.dir")+"/screenshots"+"_"+tname +"_" +timestamp+".png";
		
		File destination = new File(dest);
		FileUtils.copyFile(src, destination);
		
		return dest;
	}
}
