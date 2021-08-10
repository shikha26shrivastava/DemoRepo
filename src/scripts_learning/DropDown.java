package scripts_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","G:\\Selenium Learning with naveen\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?acntType=business&_trksid=p2052190.l44594");
	
		WebElement leg_bsng_nm = driver.findElement(By.xpath("//*[@id=\"businessname\"]"));
	    leg_bsng_nm.sendKeys("Tom");
	    
		Select select = new Select(driver.findElement(By.id("")));
		select.selectByVisibleText("");
	}
}
