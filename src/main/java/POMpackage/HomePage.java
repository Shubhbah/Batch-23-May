package POMpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
    @FindBy (xpath="//*[text()='Admin']")
    private WebElement admin;
    
    @FindBy (xpath="//*[text()='PIM']")
    private WebElement PIM;
    
    @FindBy (xpath="//*[text()='Leave']")
    private WebElement leave;
	
    
    
    public HomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
	    Thread.sleep
    }
    public boolean verifyAdminTab()
    {
    	boolean result=admin.isDisplayed();
    	return result;
    }
    public boolean verifyPIMTab()
    {
    boolean result1=PIM.isDisplayed();
    return result1;	
    }
    public boolean verifyleaveTab()
    {
    	boolean result2=leave.isDisplayed();
    	return result2;
    }


	
}
