package Test;


import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import POMpackage.HomePage;
import POMpackage.LogInPage;
import Utility.Pojo;
import Utility.Screenshot;
import Utility.Waits;

public class TestclassA extends Pojo
{
WebDriver driver;
SoftAssert s=new SoftAssert();
HomePage home;
ExtentTest logger;
ExtentReports extent;
@BeforeClass
public void beforeClass()
{
	WebDriver driver=openChromeBrowser();
	this.driver=driver;
	ExtentHtmlReporter report=new ExtentHtmlReporter("./test-output/Velocity.html");
	extent=new ExtentReports();
	extent.attachReporter(report);
	 logger=extent.createTest("verifyLoginPage");
	logger=extent.createTest("verifyHomePage");
}
	

@Test(priority=0)
public void verifyLoginPage() throws InterruptedException
{
	LogInPage login=new LogInPage(driver);
	String actualurl=driver.getCurrentUrl();
	String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	SoftAssert s=new SoftAssert();
	s.assertEquals(actualurl,expectedURL);
	s.assertAll();
	Thread.sleep(2000);
	login.sendUserName();
	login.sendpassword();
	login.ClickOnLoginButton();
	

}
	
	
	

@Test(priority=1)
public void verifyHomePage() throws InterruptedException 
{
	HomePage home=new HomePage(driver);
	Thread.sleep(3000);
	String actualurl=driver.getCurrentUrl();
	String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeLis";
	SoftAssert s=new SoftAssert();
	s.assertEquals(actualurl,expectedURL);
	s.assertAll();
	Thread.sleep(2000);

	}

@AfterMethod
public void aftermethod(ITestResult result) throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		String path=Screenshot.captureScreenshot(driver);
		Screenshot.captureScreenshot(driver);
		logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(path).build());
	}
	extent.flush();
}

	
		
}
