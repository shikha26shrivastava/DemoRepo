package testng_learning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationLearning 
{
	@BeforeSuite
	public void dbConnection()
	{
		System.out.println("db connection");
	}
	@BeforeTest
	public void url()
	{
		System.out.println("url successful");
	}
	
	@BeforeClass
	public void login()
	{
		System.out.println("login successful");
	}
	
	@BeforeMethod()
	public void title()
	{
		System.out.println("title successful");
	}
	
  @Test(priority=2,groups="1")
  public void f() 
  {
	  System.out.println("This is first Test");
	  int y =2/0;
  }
  
  @Test(priority=1,groups="2")
  public void g() 
  {
	  System.out.println("This is second Test");
  }
  
  @Test(dependsOnMethods="f")
  public void h() 
  {
	  System.out.println("This is second Test");
  }
  
	@AfterSuite
	public void dbConnection1()
	{
		System.out.println("db connection closed");
	}
	@AfterTest
	public void url1()
	{
		System.out.println("url successful closed");
	}
	
	@AfterClass
	public void login1()
	{
		System.out.println("login successful closed");
	}
	
	@AfterMethod()
	public void title1()
	{
		System.out.println("title successful closed");
	}
}
