package scripts_learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandling 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","G:\\Selenium Learning with naveen\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input"));
	    driver.findElement(By.name("proceed")).click();;
	    
	    Thread.sleep(5000);
	    
	    Alert alert = driver.switchTo().alert();
	    String alert_text = alert.getText();
	    System.out.println(alert_text);
	    
	    alert.accept();
	   // alert.dismiss(); // to cancel the alert
	}
}
