package scripts_learning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PorpertiesFileConcept 
{

	
	public static void main(String[] args) throws IOException
	   {
		 WebDriver driver;
		 Properties prop = new Properties();
		 FileInputStream ip = new FileInputStream("\\C:\\Users\\123\\eclipse-workspace\\Selenium Sessions\\src\\scripts_learning\\config.properties");
	     prop.load(ip);
	     
	     System.out.println(prop.getProperty("name"));
	     System.out.println(prop.getProperty("age"));
	     System.out.println(prop.getProperty("company"));
	     
	     String browser_nm=prop.getProperty("url");
	     
	     if(browser_nm.equalsIgnoreCase("chrome"))
	     {
	    	 System.setProperty("webdriver.chrome.driver","G:\\Selenium Learning with naveen\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
	 		 driver =new ChromeDriver();
	     }
	     else if(browser_nm.equalsIgnoreCase("ff"))
	     {
	    	 System.setProperty("webdriver.chrome.driver","G:\\Selenium Learning with naveen\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
	 		 driver =new ChromeDriver();
	     }
	     else if(browser_nm.equalsIgnoreCase("ie"))
	     {
	    	 System.setProperty("webdriver.chrome.driver","G:\\Selenium Learning with naveen\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
	 		 driver =new ChromeDriver();
	     }
	    	 
	     
	   }
}
