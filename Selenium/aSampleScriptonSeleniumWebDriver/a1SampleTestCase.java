package aSampleScriptonSeleniumWebDriver;

import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class a1SampleTestCase 
{
	WebDriver driver;
		
	public static void main(String[] args) throws InterruptedException 
	{
		
	}
	
	@Test
	public void registerUser() throws InterruptedException 
	{
		try{
		System.out.println("Test Started");
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("email_create")).sendKeys("a2@c.d");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle().toString());
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("a");
		driver.findElement(By.id("customer_lastname")).sendKeys("b");
		driver.findElement(By.id("passwd")).sendKeys("12345");
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.id("days"));
		Select dayDD= new Select (day);
		dayDD.selectByIndex(2);
		System.out.println(dayDD.getFirstSelectedOption().getText().trim().toString());
		
		WebElement month = driver.findElement(By.id("months"));
		Select monthDD = new Select(month);
		monthDD.selectByVisibleText("February ");
		System.out.println(monthDD.getFirstSelectedOption().getText().trim().toString());
		
		WebElement year = driver.findElement(By.id("years"));
		Select yearDD = new Select(year);
		yearDD.selectByValue("1985");
		System.out.println(yearDD.getFirstSelectedOption().getText().trim().toString());
		Thread.sleep(3000);
		
		driver.findElement(By.id("firstname")).sendKeys("a");
		driver.findElement(By.id("lastname")).sendKeys("b");
		driver.findElement(By.id("company")).sendKeys("c");
		driver.findElement(By.id("address1")).sendKeys("d");
		driver.findElement(By.id("city")).sendKeys("e");
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select stateDD = new Select(state);
		stateDD.selectByVisibleText("Texas");
		System.out.println(stateDD.getFirstSelectedOption().getText().trim().toString());
		
		driver.findElement(By.id("postcode")).sendKeys("00000");
		driver.findElement(By.id("phone_mobile")).sendKeys("1");
		driver.findElement(By.id("alias")).sendKeys("g");
		
		driver.findElement(By.id("submitAccount")).click();
		Thread.sleep(3000);
		
		System.out.println("Test Ended");
		}
		catch(Exception e)
		{
			Log.EXCEPTION.toString();
			System.out.println("Exe "+e.getMessage().toString());
		}
		
	}
	
	
	@BeforeSuite
	public void initilizeDrive() throws InterruptedException
	{
		try
		{	System.setProperty("webdriver.chrome.driver", "D:\\Dump\\Backup\\Automation\\Selenium\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			
			Thread.sleep(5000);
			System.out.println("Browser Opened");
			System.out.println(driver.getTitle());
		}
		
		catch(Exception e)
		{
			System.out.println("Unable to open browser");
			Log.EXCEPTION.toString();
		}
		
	}
	
	@AfterSuite
	public void terminateDriver()
	{
		try
		{
			driver.close();
			System.out.println("Browser Closed");
			Log.EXCEPTION.toString();
		}
		catch (Exception e)
		{
			System.out.println("Unable to close driver");
			Log.EXCEPTION.toString();
		}

	}

}