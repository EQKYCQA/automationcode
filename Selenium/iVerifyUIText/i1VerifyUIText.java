package iVerifyUIText;

import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class i1VerifyUIText 
{
	WebDriver driver;
	
	public static void main(String args[])
	{
		
	}
	
	@BeforeSuite
	public void intialise()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Dump\\Backup\\Automation\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://learn-automation.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("Unable to open browser");
			Log.EXCEPTION.toString();
		}
		
	}
	
		
	@Test
	public void verifyText()
	{
		try
		{
		String actualText = driver.findElement(By.xpath("//li[@id='menu-item-3800']")).getText();
		
		String expectedText = "Home";
		//Using stored
		Assert.assertEquals(actualText, expectedText);
		
		//Using direct fetching
		Assert.assertEquals(driver.findElement(By.xpath("//li[@id='menu-item-3800']")).getText(), "Homes");
		
		//Using  
		Assert.assertTrue(actualText.contains("Hom"));
		
		//System.out.println("Actual value is "+actualText);
		}
		
		catch (Exception e)
		{
			Log.EXCEPTION.toString();
		}
	}
	
	//@Test
	public void verifyAttributeText()
	{
		WebElement homeMenu = driver.findElement(By.xpath("//li[@id='menu-item-3800']"));
		
	}
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}

}
