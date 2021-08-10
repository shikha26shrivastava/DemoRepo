package scripts_learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JavaScriptExecutorConcept {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","G:\\Selenium Learning with naveen\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies();  //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://freecrm.com/");
		
		WebElement lgn_btn = driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[3]/ul/a/span[2]"));
		
		flash(lgn_btn,driver);

	}
    
	public static void flash(WebElement ele, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String bgcolor = ele.getCssValue("bakgroundcolor");
		
		for(int i=0;i<100;i++)
		{
			js.executeScript("arguments[0].style.backgroundcolor='rgb(0,200,0)'", ele);
			js.executeScript("arguments[0].style.backgroundcolor='"+bgcolor+"'", ele);
		}
	}
}
