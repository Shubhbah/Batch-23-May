package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits 
{
	static WebDriver driver;
public static WebDriverWait ExplicitWait(String x,int y)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(null));
	return wait;
}
public static void ImplicitWait()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
}
