package scripts_learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Learning with naveen\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.get("https://classic.crmpro.com/register/");
        
        
        //isDisplayed
        boolean b1 = driver.findElement(By.xpath("//*[@id=\"multipleForm\"]/div[12]/div")).isDisplayed();
        System.out.println("b1");
        
        //isEnabled
        boolean b2 = driver.findElement(By.xpath("//*[@id=\"multipleForm\"]/div[12]/div")).isEnabled();
        System.out.println("b2");
        
        //For clicking on  I agree with the terms and conditions.
        driver.findElement(By.xpath("//*[@id=\"multipleForm\"]/div[11]/div/label/input")).click();
        
        //isSelected
        boolean b3 = driver.findElement(By.xpath("//*[@id=\"multipleForm\"]/div[11]/div/label/input")).isEnabled();
        System.out.println("b3");
        
        
        //For deselecting on  I agree with the terms and conditions.
        driver.findElement(By.xpath("//*[@id=\"multipleForm\"]/div[11]/div/label/input")).click();
        
      //isSelected
        boolean b4 = driver.findElement(By.xpath("//*[@id=\"multipleForm\"]/div[11]/div/label/input")).isEnabled();
        System.out.println("b4");
        
	}

}
