package aSampleScriptonSeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class a4Page extends a2Driver
{
	public a4Page(WebDriver driver)
	{
		super(driver);
	}
	
	a2Driver driv = new a2Driver(null);
	a3Control ctrl = new a3Control(null);
	
	WebElement singIn = driver.findElement(By.xpath("//a[@class='login']"));
	WebElement email = driver.findElement(By.id("email_create"));
	WebElement createAcc = driver.findElement(By.id("SubmitCreate"));
	
	public void registerUser(String emailId) throws InterruptedException 
	{
		ctrl.click(singIn);
		ctrl.sendkeys(email, emailId);
		ctrl.click(createAcc);
	}
	
}
