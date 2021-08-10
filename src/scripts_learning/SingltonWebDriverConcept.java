package scripts_learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SingltonWebDriverConcept 
{
	private static SingltonWebDriverConcept sc = null;
	public static WebDriver driver;
	
	public static SingltonWebDriverConcept getDriver()
	{
		if(sc == null)
			sc = new SingltonWebDriverConcept();
		return sc;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		SingltonWebDriverConcept sc1 = SingltonWebDriverConcept.getDriver();
		driver = new InternetExplorerDriver();
		driver.get("www.google.com");
		
		
		
		
	}


}
