package scripts_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","G:\\Selenium Learning with naveen\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?acntType=business&_trksid=p2052190.l44594");
	    
		WebElement leg_bsng_nm = driver.findElement(By.xpath("//*[@id=\"businessname\"]"));
	    leg_bsng_nm.sendKeys("Tom");
	    
	    driver.findElement(By.xpath("//*[@id=\"businessemail\"]")).sendKeys("GreyOrange");
	    
	   // driver.findElement(By.xpath("")).sendKeys("mymail.tcs.com");
	    
	    //id
	    
       // driver.findElement(By.id("businessemail")).sendKeys("GreyOrange");
	    
	  //  driver.findElement(By.id("")).sendKeys("mymail.tcs.com");
	    
	    //name
	    
       // driver.findElement(By.name("businessemail")).sendKeys("GreyOrange");
	  //  driver.findElement(By.name("")).sendKeys("mymail.tcs.com");
        
        //linkText
        driver.findElement(By.linkText("Or create a personal account")).click();
	    
        //partialLinkText
        
        driver.findElement(By.partialLinkText("Or create a")).click();
        
        //css selector
        driver.findElement(By.cssSelector("#businessname")).sendKeys("shikha");
        
        //class
        driver.findElement(By.className("")).sendKeys("aanvi");
	    

	}

}
