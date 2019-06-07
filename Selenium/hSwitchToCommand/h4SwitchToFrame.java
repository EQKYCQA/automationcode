package hSwitchToCommand;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class h4SwitchToFrame 
{
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Dump\\Backup\\Automation\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://letsdoitin.blogspot.com/");
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText().toString(), "Let's Do It");
		
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("Browser open error details "+e);
		}
	}
	
	@AfterTest
	public void afterTest()
	{
		try
		{
			driver.quit();
		}
		catch(Exception e)
		{
			System.out.println("Browser close error details "+e);
		}
	}
	
	//Needs to find hope to have own html working
	
	
	@Test
	public void switchToFrameByName()
	{
		try
		{
			Thread.sleep(5000);
			Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText().toString(), "Let's Do It");
			//Command to switch by Name
			driver.switchTo().frame("navbar-iframe");
			System.out.println("Moves to frame");
			driver.findElement(By.xpath("//td[@id='b-query']")).clear();
			driver.findElement(By.xpath("//td[@id='b-query']")).sendKeys("selenium");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//h3]")).click();
			
		}
		catch(Exception e)
		{
			System.out.println("switchToFrameByName Test failed due to "+e);
			
		}
	}
	
	@Test
	public void swichToFrameByID()
	{
		try
		{
			Thread.sleep(5000);
			Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText().toString(), "Let's Do It");
			
			//Command to switch by ID
			driver.switchTo().frame("frameID");
			
			System.out.println("Moves to frame");
			driver.findElement(By.xpath("//td[@id='b-query']")).clear();
			driver.findElement(By.xpath("//td[@id='b-query']")).sendKeys("selenium");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//h3]")).click();
			
		}
		catch(Exception e)
		{
			System.out.println("switchToFrameByName Test failed due to "+e);
			
		}
	}
	
	@Test
	public void swichToFrameByIndex()
	{
		try
		{
			Thread.sleep(5000);
			Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText().toString(), "Let's Do It");
			
			int noOfFrames = driver.findElements(By.tagName("tag")).size();
					
			//Command to switch by Index
			driver.switchTo().frame(noOfFrames);
			
			System.out.println("Moves to frame");
			driver.findElement(By.xpath("//td[@id='b-query']")).clear();
			driver.findElement(By.xpath("//td[@id='b-query']")).sendKeys("selenium");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//h3]")).click();
			
		}
		catch(Exception e)
		{
			System.out.println("switchToFrameByName Test failed due to "+e);
			
		}
	}
	
	
	@Test
	public void switchToFrameByWebElement()
	{
		try
		{
			Thread.sleep(2000);
			Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText().toString(), "Let's Do It");
			Thread.sleep(3000);
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(3000);
			
			//Command to switch by webElement
			WebElement frame = driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/presentation/d/1ia61jFDVxcElwmczjyuuvrFa7wRQ97afxO4mv_2p3i4/embed?start=false&loop=false&delayms=3000']"));
			driver.switchTo().frame(frame);
			System.out.println("Moves to frame");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//meta[@content='Non Functional Testing_Sampath kumar Mohan.pptx']")).click();
			System.out.println("Frame accessed");
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println("SwitchToFrameByWebElement Test failed due to "+e);
		}
	}

}
