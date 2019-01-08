package gHeadless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class G1HeadlessChromeOption 
{
	@Test
	public void HeadlessChromeOption()
	{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		// Create Object of ChromeOption Class
		ChromeOptions option=new ChromeOptions();

		//Set the setHeadless is equal to true which will run test in Headless mode
		//option.setHeadless(true);
				
		//add the –headless argument in option class which will run test in Headless mode
		option.addArguments("–headless");

		// pass the option object in ChromeDriver constructor
		WebDriver driver=new ChromeDriver(option);
		
		//driver = new ChromeDriver();
		driver.get("http://learn-automation.com/");		
		driver.manage().window().maximize();
		System.out.println("Title is "+driver.getTitle().toString());
		driver.quit();		
	}
}
