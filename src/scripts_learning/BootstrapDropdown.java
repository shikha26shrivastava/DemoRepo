package scripts_learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootstrapDropdown {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "G:\\Selenium Learning with naveen\\InternetExplorerDriver\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver =  new InternetExplorerDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']"))));
		
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		
		List<WebElement> lst = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label"));
	
		System.out.println("The list size is "+lst.size());
		
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i).getText());
			
			if(lst.get(i).getText().equalsIgnoreCase(" Angular"))
					{
				         lst.get(i).click();System.out.println("eleemnt got clicked");
				         
				         break;
					}
		}
	}

}
