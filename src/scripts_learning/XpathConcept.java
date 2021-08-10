package scripts_learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathConcept 
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
		
//		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("java");
		
	//	driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("java");
	//	driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("java");
		
	//	driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("java");
		
		driver.findElement(By.xpath("//input[starts-with(@class,'gh-tb')]")).sendKeys("java");
		
	//	driver.findElement(By.xpath("//input[ends-with(@class,'ui-autocomplete-loading')]")).sendKeys("java");
		
		//clicking on sign
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
	}
}
