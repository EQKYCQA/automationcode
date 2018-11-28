package eWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class e6CustomeWait 
{
	WebDriver driver;
	
	@Test
	public void customWait() 
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		
		WebElement sIn = isElementPresnt(driver, signIn, 10);
		
		sIn.click();
		
		System.out.println("Clicked");
		
		driver.quit();
		}
		catch(Exception e)
		{
			System.out.println("Exception "+e.getMessage());
		}
	}
	
	public static WebElement isElementPresnt(WebDriver driver,WebElement element,int time)
	{
		WebElement ele = null;

		for(int i=0;i<time;i++)
		{
			System.out.println("Iteration "+i);
			try
			{
				ele=element;
				break;
			}
			catch(Exception e)
			{
				try 
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException e1) 
				{
					System.out.println("Waiting for element to appear on DOM");
				}
			}
		}
		return ele;
	}
}