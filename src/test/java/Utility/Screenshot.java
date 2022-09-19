package Utility;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot
{
	 static WebDriver driver;
public static String captureScreenshot(WebDriver driver) throws IOException
{
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String path=("\\test-output\\Screenshot"+System.currentTimeMillis()+".jpg");
		File dest=new File(path);
	FileUtils.copyDirectory(source, dest);
	return path;
}
}
