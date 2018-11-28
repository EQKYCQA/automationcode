package eWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class e3ExplicitWaitUtil 
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
		
		WebElement createAc = driver.findElement(By.id("SubmitCreate"));
		
		eWaitClick(createAc);
		
		}
		catch(Exception e)
		{
			System.out.println("Exception "+e.getMessage());
		}
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.quit();
	}
	
	public void eWaitClick(WebElement element) throws InterruptedException
	{
		
		WebDriverWait eWt = new WebDriverWait(driver, 30);
		
		WebElement ele = eWt.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitCreate1")));
		
		System.out.println("Element "+ele);
		
		if(ele.isDisplayed())
		{
			ele.click();
			System.out.println("Element displayed as "+ele);
		}
		else
		{
			System.out.println("Element not displayed "+ele);
		}
		
		System.out.println(driver.getTitle().toString());
		
	}

}
