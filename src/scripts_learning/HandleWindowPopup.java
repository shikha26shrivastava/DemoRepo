package scripts_learning;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup 
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
		
		driver.get("http://www.popuptest.com/");
		
		//clikc on first poup link
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[1]/b/a")).click();
		
		Thread.sleep(200);
		Set<String> handler = driver.getWindowHandles();	
		Iterator<String> it =handler.iterator();
		
		String partentWindowId = it.next();
		
		System.out.println(partentWindowId);
		
        String childWindowId = it.next();
        System.out.println(childWindowId);
        
        driver.switchTo().window(childWindowId);
        Thread.sleep(200);
        
        System.out.println("child title is "+driver.getTitle());
        
        driver.close();
        
        driver.switchTo().window(partentWindowId);
        Thread.sleep(200);
        System.out.println("parent title"+driver.getTitle());
	  }
}
