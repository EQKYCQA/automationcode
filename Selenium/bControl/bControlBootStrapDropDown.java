package bControl;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bControlBootStrapDropDown 
{
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		bControlBootStrapDropDown dd = new bControlBootStrapDropDown();
		dd.dropDown();
	}

	public void dropDown()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Dump\\Backup\\Automation\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
		
		for(int i=0;i<list.size();i++)
		{
			WebElement listVale = list.get(i);
			System.out.println("Dropdown value "+listVale.getAttribute("innerHTML"));
		}
		
		for(WebElement val : list)
		{
			System.out.println("String value is "+val.getText().toString());
			
			if(val.getText().toString().contains("Another action"))
			{
				System.out.println("Clicked value is "+val.getText().toString());
				val.click();
				
				break;
			}
			
			else
			{
				System.out.println("Unable to click "+val.getText().toString());
			}
		}
		
		driver.quit();
		}
		catch(Exception e)
		{
			System.out.println("Failed due to "+e.toString());
		}
	}
}
