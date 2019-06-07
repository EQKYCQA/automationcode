package aSampleScriptonSeleniumWebDriver;

import static org.testng.Assert.assertEquals;

import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample 
{
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		sample smp = new sample();
		
		smp.initilizeDrive();
	}
	
	public void initilizeDrive() throws InterruptedException
	{
		try
		{	
			System.setProperty("webdriver.chrome.driver", "D:\\Dump\\Backup\\Automation\\Selenium\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			
			Thread.sleep(5000);
			System.out.println("Browser Opened");
			System.out.println(driver.getTitle());
			
			driver.findElement(By.xpath("//div[@id='contact-link']")).click();
			
			assertEquals(driver.getTitle(), "Contact us - My Store");
			System.out.println("Page Redirecttion Verified");
			
			driver.close();
			System.out.println("Browser Closed");
		}
		
		catch(Exception e)
		{
			System.out.println("Unable to open browser");
			Log.EXCEPTION.toString();
		}
		
	}

}
