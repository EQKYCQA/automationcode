package aSampleScriptonSeleniumWebDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;


public class a5IEBrowser
{

	public static void Main(String args[]) throws Exception
	{
		// set driver path
		System.setProperty("webdriver.ie.driver","Driver\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		
		// Initialise browser
		WebDriver driver=new InternetExplorerDriver();

		//DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);

		// Load google.com
		driver.get("http://www.google.com");
		
		Thread.sleep(1000);

		// close browser
		driver.close();
	}
}