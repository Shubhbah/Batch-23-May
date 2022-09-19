package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMpackage.HomePage;
import POMpackage.LogInPage;


public class Test12
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp840G2_2\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     //Test case 1- Verify login functionality

	LogInPage login=new LogInPage(driver);
	login.sendUserName();
	login.sendpassword();
	login.ClickOnLoginButton();
	
	 //Test case 2- Verify homepage functionality
	HomePage home=new HomePage(driver);
	home.verifyAdminTab();
	home.verifyPIMTab();
	home.verifyleaveTab();
	
	

}
}
