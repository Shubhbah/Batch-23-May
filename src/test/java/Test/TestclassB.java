package Test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestclassB
{
	public class TestclassA
	{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before Class");
		
	}
		
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before Method");
		
	}
	@Test
	public void testA()
	{
		System.out.println("Test P");
	}
	@Test(priority=7)
	public void testB()
	{
		
		System.out.println("Test Q");
	}
	@Test(priority=4)
	public void testC()
	{
		System.out.println("Test R");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("Aftermethod");
	}
	@AfterClass
	public void afterClass()
	{
	 System.out.println("afterclass");
	}
	}}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

