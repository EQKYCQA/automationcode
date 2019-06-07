package iVerifyUIText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class i2VerifyToolTip
{
	WebDriver driver;
	
	@BeforeSuite
	public void beforeTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Dump\\Backup\\Automation\\Selenium\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://learn-automation.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	}
	
	@Test
	public void tooltip() throws InterruptedException
	{
		//Webelement of object which you needs to use for capturing tooltip
		WebElement google = driver.findElement(By.xpath("//div[@class='fusion-social-links-header']//a[@class='fusion-social-network-icon fusion-tooltip fusion-googleplus fusion-icon-googleplus']"));
		
		//Create object for action class
		Actions builder = new Actions(driver);
		
		//Perform move to element action
		builder.moveToElement(google).perform();
		
		Thread.sleep(5000);
		
		String gtip = google.getText();
		
		Assert.assertEquals(gtip, "Google+");
		
		System.out.println("Google tool tip is " +gtip);
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}

}
