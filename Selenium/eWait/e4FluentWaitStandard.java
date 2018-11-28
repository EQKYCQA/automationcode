package eWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class e4FluentWaitStandard 
{

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
			System.out.println(driver.getTitle().toString());
			
			driver.findElement(By.xpath("//a[@class='login']")).click();
			
			driver.findElement(By.id("email_create")).sendKeys("a2@c.d");
			
			
			// Waiting 60 seconds for an element to be present on the page, checking
			// for its presence once every 2 seconds.
			
			//Create variable for fluent wait
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(60, TimeUnit.SECONDS)
					.pollingEvery(2, TimeUnit.SECONDS)
					.ignoring(NoSuchElementException.class);

			
			WebElement ele = wait.until(new Function<WebDriver, WebElement>() 
			{
				public WebElement apply(WebDriver driver) 
				{
					return driver.findElement(By.id("SubmitCreate1"));
				}
			});
			
			
			ele.click();
			System.out.println(driver.getTitle().toString());
			
			}
			catch(Exception e)
			{
				System.out.println("Exception "+e.getMessage());
			}
			
			driver.quit();
		}

}
