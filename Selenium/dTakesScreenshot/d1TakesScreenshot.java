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

public class d1TakesScreenshot 
{
	static WebDriver driver = null;
	static d1TakesScreenshot d1 = new d1TakesScreenshot();
	static d2CaptureScreenshot d2 = new d2CaptureScreenshot();
	
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Dump\\Backup\\Automation\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		System.out.println(driver.getTitle().toString());
		
		d1.captureScreen1(driver);
		
		d1.clickSignIn(driver);
		
		d1.createAc();
		
		d1.closeBrowser(driver);
		
	}
	
	public void captureScreen1(WebDriver driver) throws IOException
	{
	TakesScreenshot screen = (TakesScreenshot)driver;
	File Source = screen.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Source, new File("D:/Automation Projects/AutomationLearning/Screenshots/Open.png"));
	}
	
	public void closeBrowser(WebDriver driver) throws IOException
	{
		// Take screenshot and store as a file format
		File Scr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(Scr, new File("D:/Automation Projects/AutomationLearning/Screenshots/Close.png"));
		
		driver.quit();
	}
	
	public void clickSignIn(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		//Invoke method to capture screenshot by time
		d2.captureScreenShot(driver);
	}
	
	public void createAc()
	{
		driver.findElement(By.id("email_create")).sendKeys("a2@c.d");
		driver.findElement(By.id("SubmitCreate")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		//Invoking method that capture based on your image label
		d2.captureScreenShot(driver, "Open browser");
	}
	
}
