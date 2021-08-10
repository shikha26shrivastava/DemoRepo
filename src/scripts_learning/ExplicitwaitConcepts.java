package scripts_learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitConcepts 
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
		
		driver.get("https://www.facebook.com/");
		
		clickOn(driver,driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")),20);
		
	}
	
	public static void clickOn(WebDriver driver ,WebElement locator , int timeOut)
	{
		new WebDriverWait(driver,timeOut).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
	
}
