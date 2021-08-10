package scripts_learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept 
{

	public static void main(String[] args) throws InterruptedException
	{
		
	
		System.setProperty("webdriver.chrome.driver","G:\\Selenium Learning with naveen\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies();  //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		
		List <WebElement> noOfLinks =driver.findElements(By.tagName("a"));
		
		System.out.println("no of links are" + noOfLinks.size());
		
		for(int i=0 ; i< noOfLinks.size();i++)
		{
			System.out.println(i +"links is"+noOfLinks.get(i).getText());
		}
		
		
	}
}
