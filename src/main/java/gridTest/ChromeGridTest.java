package gridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest 
{
	//By Using Java Main Method
	
	public static void main(String[] args) throws MalformedURLException 
	{	
		//1. Define Desired Capabilities 
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		
		//2. chrome Option Definition:
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String hubUrl = "http://192.168.43.104:4444/wd/hub";
						
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
		
		
		
		//3. driver navigation
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
				
	}
}
