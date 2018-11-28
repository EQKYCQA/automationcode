package eWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class e1ImplicitlyWaitbeforeException {

	WebDriver driver;
	
	@Test
	public void implicitWait() 
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		//Wait 30 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("email_create")).sendKeys("a2@c.d");
		
		
		driver.findElement(By.id("SubmitCreate1")).click();
		System.out.println("Page Title: "+driver.getTitle().toString());
		
		
		driver.quit();
		}
		catch(Exception e)
		{
			System.out.println("Exception "+e.getMessage());
		}
	}
		

}
