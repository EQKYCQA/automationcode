package aSampleScriptonSeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class a3Control extends a2Driver
{

	WebDriver driver;
	
	public a3Control(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void click(WebElement element) throws InterruptedException
	{
		try
		{
			element.click();
			System.out.println("Click "+element);
			Thread.sleep(1000);	
		}
		
		catch(Exception e)
		{
			System.out.println("Unable click "+element);
		}
	}
	
	public void sendkeys(WebElement element, String value)
	{
		try
		{
			element.clear();
			element.sendKeys(value);
			System.out.println(value+" entered in "+element);
			Thread.sleep(1000);
		}
		
		catch(Exception e)
		{
			System.out.println("Unable enter values in "+element);
		}
	}
}
