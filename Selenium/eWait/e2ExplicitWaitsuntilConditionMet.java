package eWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class e2ExplicitWaitsuntilConditionMet 
{
	WebDriver driver;
	
	@Test
	public void explicitWait() 
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
		
		
		driver.findElement(By.id("email_create")).sendKeys("a2@c.d");
		
		// Create object of WebDriverWait class and it will wait max of 20 seconds.
		// By default it will accepts in Seconds
		WebDriverWait wait = new WebDriverWait(driver, 30);
		 
		// Here we will wait until element is not visible, if element is visible then it will return web element
		// or else it will throw exception
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitCreate1")));
		
		// if else condition
		if (element.isDisplayed())
		{
			System.out.println("===== WebDriver is visible======");
		}
		else
		{
			System.out.println("===== WebDriver is not visible======");
		}
				
		driver.findElement(By.id("SubmitCreate")).click();
		System.out.println("Page Title: "+driver.getTitle().toString());
		
		
		driver.quit();
		}
		catch(Exception e)
		{
			System.out.println("Exception "+e.getMessage());
		}
	}

}
