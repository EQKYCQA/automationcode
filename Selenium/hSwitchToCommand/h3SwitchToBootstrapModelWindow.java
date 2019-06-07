package hSwitchToCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class h3SwitchToBootstrapModelWindow 
{
	WebDriver driver;
	
	@BeforeTest
	public void beforeMethod() throws InterruptedException
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Dump\\Backup\\Automation\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/bootstrap-modal-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
	@AfterTest
	public void afterMethod()
	{
		driver.quit();
	}
	
	//@Test
	public void bootstrapModel()
	{
		try
		{
		System.out.println("Test Started");
		driver.findElement(By.xpath("//div[@class='col-md-6 text-left']//div[@class='row'][1]//a[text()='Launch modal']")).click();
		System.out.println("Launch button from home page clicked");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		//Using direct assert
		Assert.assertEquals(driver.findElement(By.xpath("//h4")).getText(), "Modal Title");
		
		driver.findElement(By.xpath("//a[text()='Save changes']")).click();
		System.out.println("Window closed");
		
		Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(), "Bootstrap Modal Example for Automation");
		}
		catch(Exception e)
		{
			System.out.println("Error found is "+e.toString());
		
		}
	}
	
	@Test
	public void bootstrapMultiModel()
	{
		try
		{
		System.out.println("Test Started");
		driver.findElement(By.xpath("//div[@class='col-md-6 text-left']//div[@class='row'][2]//a[text()='Launch modal']")).click();
		System.out.println("Launch button from home page clicked");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(4000);

		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='myModal']//h4")).getText(), "First Modal");
		
		driver.findElement(By.xpath("//div[@class='modal-body']//a[text()='Launch modal']")).click();
		System.out.println("Model 1 button clicked");
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='myModal2']//h4")).getText(), "Modal 2");
		System.out.println("Assert pass");
		
		driver.findElement(By.xpath("//div[@id='myModal2']//a[text()='Save changes']")).click();
		System.out.println("Model 2 Button clicked");
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(), "Bootstrap Modal Example for Automation");
		System.out.println("Assert pass");
		}
		catch(Exception e)
		{
			System.out.println("Error found is "+e.toString());
		}
	}

}
