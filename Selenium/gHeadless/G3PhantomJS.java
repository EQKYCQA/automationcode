package gHeadless;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class G3PhantomJS 
{
	@Test
	public void PhantomJS()
	{
		File src = new File("D:\\Automation Projects\\AutomationLearning\\PhantomJS_exe\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("https://staging.ie.kycnet.com/users/login/");
		WebElement username = driver.findElement(By.xpath("//input[@id='user_name']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='user_pass']"));
		WebElement login = driver.findElement(By.xpath("//button[@id='loginButton']"));
		WebElement help = driver.findElement(By.xpath("//a[@href='mailto:passport.support@kycnet.com']"));
		boolean buttonStatus = login.isDisplayed();
		if(buttonStatus==true)
		{
			username.clear();
			username.sendKeys("javier van der meulen");
			password.clear();
			password.sendKeys("KYCnet123");
			login.click();
			System.out.println("Home page "+ driver.getTitle());
		}
		else
		{
			System.out.println("Login page "+ driver.getTitle());
		}
		driver.manage().window().maximize();
		driver.quit();
	}
}
