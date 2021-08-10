package scripts_learning;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrokenLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.ie.driver", "G:\\Selenium Learning with naveen\\InternetExplorerDriver\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver =  new InternetExplorerDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies();  //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://makemysushi.com/404?");
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		
		List<WebElement> activeLinkList =new ArrayList<WebElement>();
		
		for(int i=0;i<linklist.size();i++)
		{
			if(linklist.get(i).getAttribute("href")!=null && !(linklist.get(i).getAttribute("href").contains("javascript")))
			{
				activeLinkList.add(linklist.get(i));
			}
		}
		try
		{
		for(int j=0;j<activeLinkList.size();j++)
		{
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinkList.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println("url is "+activeLinkList.get(j).getAttribute("href")+"---."+response);
		
		}
		}
		catch(Exception e)
		{
			
		}
	}

}
