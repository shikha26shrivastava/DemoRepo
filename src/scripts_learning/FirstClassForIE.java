package scripts_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstClassForIE {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "G:\\Selenium Learning with naveen\\InternetExplorerDriver\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver =  new InternetExplorerDriver();
		driver.get("https://www.google.com");
		
		//for search
		driver.findElement(By.name("q")).sendKeys("testing");
		
		
		

	}

}
