package scripts_learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling 
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
		
		
		driver.get("https://ui.freecrm.com/");
		
		driver.findElement(By.name("email")).sendKeys("shilpi2686.shri@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Aanv1@123@0307");
		
		//driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		Thread.sleep(3000);
		//driver.switchTo().frame("mainPanel");
		
		//contacts
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]/span")).click();
	  // driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	}

}
