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
			String title=driver.getTitle();

			String actualText = driver.findElement(By.xpath("//li[@id='menu-item-3800']")).getText();
			
			String actualHTML = driver.findElement(By.xpath("//li[@id='menu-item-3800']")).getAttribute("innerHTML");

			String expectedText = "Home";
			
			boolean titlePresent = driver.getPageSource().contains("Selenium WebDriver tutorial - Selenium WebDriver tutorial Step by Step");
			Assert.assertTrue(titlePresent);

			//Condition assert with contains text
			Assert.assertTrue(title.contains("tutorial"));
			
			//Using direct assert
			Assert.assertEquals(title, "Selenium WebDriver tutorial - Selenium WebDriver tutorial Step by Step");

			//Using stored
			Assert.assertEquals(actualText, expectedText);

			//Using direct fetching
			Assert.assertEquals(driver.findElement(By.xpath("//li[@id='menu-item-3800']")).getText(), "Home");

			//Using  true assertion for element
			Assert.assertTrue(actualText.contains("Hom"));

			System.out.println("Actual text is "+actualText);
			
			System.out.println("Actual HTML is "+actualHTML);
			
			System.out.println("Actual source is "+titlePresent);
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
