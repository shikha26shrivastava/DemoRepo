package scripts_learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit 
{

	private static DriverInit instanceDriver = null;
	private  WebDriver driver;
	
	private DriverInit()
	{
		
	}
	
	public  WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver","G:\\Selenium Learning with naveen\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static DriverInit getObject()
	{
		if(instanceDriver == null )
			instanceDriver = new DriverInit();
		return instanceDriver;
	}
}
