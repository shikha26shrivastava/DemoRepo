package scripts_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowManualPopup 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","G:\\Selenium Learning with naveen\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://html.com/input-type-file/");
		
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\123\\Desktop\\band rejection.txt");
		
	}
}
