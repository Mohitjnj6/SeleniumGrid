package chromeGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridChromeTest 
{
	
	//By using TestNg
	
	@Test
	public void verifygrid()
	{
		try {
			//1. Define Desired Capabilities 
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			
			
			//2. chrome Option Definition:
			ChromeOptions options = new ChromeOptions();
			options.merge(cap);
			
			String hubUrl = "http://192.168.43.104:4444/wd/hub";
							
			WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
			
			
			
			//3. 
			
			driver.get("https://www.google.com/");
			System.out.println(driver.getTitle());
			
			driver.quit();
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
}
