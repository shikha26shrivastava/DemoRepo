package scripts_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelectCalendarByJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "G:\\Selenium Learning with naveen\\InternetExplorerDriver\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver =  new InternetExplorerDriver();
		
		driver.get("https://www.spicejet.com/");
		
		WebElement cal_ele = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		String dat_val = "11-08-2019";
		
		selectByJS(cal_ele,dat_val,driver);

	}
	
	public static void selectByJS(WebElement cal_ele, String dat_val,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+dat_val+"');", cal_ele);
	}
	

}
