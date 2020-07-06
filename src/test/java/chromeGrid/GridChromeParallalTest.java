package chromeGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridChromeParallalTest 
{
	
	//By using TestNg
	
	@Test
	public void Test1() throws InterruptedException
	{
		try {
			System.out.println("Test 1 Started");
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			
			
			ChromeOptions options = new ChromeOptions();
			options.merge(cap);
			
			String hubUrl = "http://192.168.43.104:4444/wd/hub";
							
			WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
			
		
			
			driver.get("https://www.google.com/");
			System.out.println("The title is  "+driver.getTitle());
			
			Thread.sleep(2000);
			
			driver.quit();
			System.out.println("Test 1 Completed");
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	}
		
		@Test
		public void Test2() throws InterruptedException
		{
			try {
				System.out.println("Test 2 Started");
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
				
				
				ChromeOptions options = new ChromeOptions();
				options.merge(cap);
				
				String hubUrl = "http://192.168.43.104:4444/wd/hub";
								
				WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
				
			
				
				driver.get("https://www.google.com/");
				System.out.println("The title is  "+driver.getTitle());
				
				Thread.sleep(2000);
				
				driver.quit();
				System.out.println("Test 2 Completed");
			} catch (MalformedURLException e) {
				
				e.printStackTrace();
			}
		
		}
			
		
		@Test
		public void Test3() throws InterruptedException
		{
			try {
				System.out.println("Test 3 Started");
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
				
				
				ChromeOptions options = new ChromeOptions();
				options.merge(cap);
				
				String hubUrl = "http://192.168.43.104:4444/wd/hub";
								
				WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
				
			
				
				driver.get("https://www.google.com/");
				System.out.println("The title is  "+driver.getTitle());
				
				Thread.sleep(2000);
				
				driver.quit();
				System.out.println("Test 3 Completed");
			} catch (MalformedURLException e) {
				
				e.printStackTrace();
			}
		
		}
	
		
		@Test
		public void Test4() throws InterruptedException
		{
			try {
				System.out.println("Test 4 Started");
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
				
				
				ChromeOptions options = new ChromeOptions();
				options.merge(cap);
				
				String hubUrl = "http://192.168.43.104:4444/wd/hub";
								
				WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
				
			
				
				driver.get("https://www.google.com/");
				System.out.println("The title is  "+driver.getTitle());
				
				Thread.sleep(2000);
				
				driver.quit();
				System.out.println("Test 4 Completed");
			} catch (MalformedURLException e) {
				
				e.printStackTrace();
			}
		
		}
	
		
		@Test
		public void Test5() throws InterruptedException
		{
			try {
				System.out.println("Test 5 Started");
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
				
				
				ChromeOptions options = new ChromeOptions();
				options.merge(cap);
				
				String hubUrl = "http://192.168.43.104:4444/wd/hub";
								
				WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
				
			
				
				driver.get("https://www.google.com/");
				System.out.println("The title is  "+driver.getTitle());
				
				Thread.sleep(2000);
				
				driver.quit();
				System.out.println("Test 5 Completed");
			} catch (MalformedURLException e) {
				
				e.printStackTrace();
			}
		
		}
	
	
	
	
}
