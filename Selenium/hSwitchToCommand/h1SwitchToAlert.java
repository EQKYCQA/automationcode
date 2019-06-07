package hSwitchToCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class h1SwitchToAlert 
{
	WebDriver driver;
	
	@Test
	public void Alert()
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Dump\\Backup\\Automation\\Selenium\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//Comment to open the alert window
		driver.findElement(By.xpath("//div[@class='panel panel-primary'][1]//button")).click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//Comment to switch to the alert window and get the text from alert window
		Assert.assertEquals(driver.switchTo().alert().getText(),"I am an alert box!");
		
		//Comment to perform accept (OK) to decline (Cancel) in alert window 
		driver.switchTo().alert().accept();
		
		//Close all window
		driver.quit();
		
	}

}
