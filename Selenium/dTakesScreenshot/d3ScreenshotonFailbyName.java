package dTakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class d3ScreenshotonFailbyName 
{
	WebDriver driver;
	d2CaptureScreenshot d2 = new d2CaptureScreenshot();

	@BeforeTest
	public void beforeMethod() throws IOException
	{
		try{
			System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
			System.out.println(driver.getTitle().toString());
		}
		catch(Exception e)
		{
			System.out.println("Error "+e.getMessage().toString());
		}
	}

	@Test
	public void clickSignIn()
	{
		try
		{
			driver.findElement(By.xpath("//a[@class='login']")).click();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			System.out.println(driver.getTitle().toString());
		}
		catch(Exception e)
		{
			System.out.println("Error "+e.getMessage().toString());
		}
	}
	
	@AfterMethod
	public void takeScreenshot(ITestResult result) throws IOException
	{
		if(ITestResult.SUCCESS==result.getStatus())
		{
		try
		{
			TakesScreenshot scr = (TakesScreenshot)driver;
			File name = scr.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(name, new File("./Screenshots/"+result.getName() +".png"));
			
			d2.captureScreenShot(driver, "Host_"+result.getHost());
			d2.captureScreenShot(driver, "Instance Name_"+result.getInstanceName());
			d2.captureScreenShot(driver, "TestName_"+result.getTestName().toString());
			d2.captureScreenShot(driver, "Instance_"+result.getInstance());
		}
		catch(Exception e)
		{
			System.out.println("Error "+e.getMessage().toString());
		}
		}
		driver.quit();
	}
	
}
