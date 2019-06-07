package hSwitchToCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//To verify if alert is present and then perform action
public class h2SwitchToAlertMethod 
{
WebDriver driver;

//Method will return true if alert is present
public boolean isAlertPresent(WebDriver driver)
{
	try
	{
		//Comment to switch to window
		driver.switchTo().alert();
		System.out.println("Alert present");
		//If switched successfully then return true.
		return true;
	}
	
	//If not switched to alert or alert not present, then selenium will give NoAlertPresentException, here we are capturing that exception and returning false. 
	catch(NoAlertPresentException ex)
	{
		System.out.println("Alert not present");
		return false;
	}
}

	@Test
	public void AlertMethod()
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Dump\\Backup\\Automation\\Selenium\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='panel panel-primary'][1]//button")).click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//Check if the alert, called method will return true. If true arrived then code will go inside the loop. 
		if(isAlertPresent(driver))
		{
			Assert.assertEquals(driver.switchTo().alert().getText(),"I am an alert box!");
		
			driver.switchTo().alert().accept();
		}
		
		//Close all window
		driver.quit();
	}
	


}
