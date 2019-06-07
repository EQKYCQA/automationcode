package iVerifyUIText;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class i3VerifyListFindElements 
{
	WebDriver driver;
	
	@Test
	public void findElements()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Dump\\Backup\\Automation\\Selenium\\driver\\chromedriver.exe");
	
		driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Get list webelements from location and store them in a list
		List<WebElement> mList = driver.findElements(By.xpath(".//*[@id='menu-top']/li"));
		
		//Using iterator to iterate elements
		Iterator<WebElement> mLst = mList.iterator();
		
		while(mLst.hasNext())
		{
			WebElement value = mLst.next();
			String name = value.getText();
			System.out.println("List value "+name);
		}
		
		driver.close();
	}
}
