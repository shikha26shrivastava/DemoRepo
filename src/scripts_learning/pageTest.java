package scripts_learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class pageTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DriverInit dinit = DriverInit.getObject();
		WebDriver driver = dinit.getDriver();
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies();  //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");

	}

}
