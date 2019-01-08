package gHeadless;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class G2HTMLUnitDriver 
{
	@Test
	public void HtmlUnitDrive() throws InterruptedException
	{		
		//Declaring and initialize  HtmlUnitWebDriver
		HtmlUnitDriver unitDriver = new HtmlUnitDriver();
		//
		unitDriver.setJavascriptEnabled(true);
		
		//HtmlUnitDriver unitDriver = new HtmlUnitDriver(true);
		
		unitDriver.get("https://staging.ie.kycnet.com/users/login/");
		Thread.sleep(3000);
		WebElement login = unitDriver.findElement(By.xpath("//button[@id='loginButton']"));
		WebElement help = unitDriver.findElement(By.xpath("//a[@href='mailto:passport.support@kycnet.com']"));
		boolean buttonStatus = login.isDisplayed();
		if(buttonStatus==true)
		{
			login.click();	
		}
		else
		{
			help.click();
		}
		System.out.println("Title of the page "+ unitDriver.getTitle());
		unitDriver.manage().window().maximize();
		unitDriver.quit();
	}

}
