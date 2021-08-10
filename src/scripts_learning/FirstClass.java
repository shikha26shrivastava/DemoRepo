package scripts_learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass 
{
  public static void main(String[] args)
  {
	//Chrome Driver Driver
	//System.setProperty(“WebDriver.chromedriver”,"G:\\Selenium Learning with naveen\\chromeDriver\\chromedriver.exe”);
	  System.setProperty("webdriver.chrome.driver","G:\\Selenium Learning with naveen\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
	String s = driver.getTitle();
	driver.getCurrentUrl();
	driver.getPageSource(); 
	driver.quit();
  }
}
