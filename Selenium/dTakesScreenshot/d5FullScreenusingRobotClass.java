package dTakesScreenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d5FullScreenusingRobotClass

{
	static d2CaptureScreenshot d2 = new d2CaptureScreenshot();
	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Dump\\Backup\\Automation\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		System.out.println(driver.getTitle().toString());

		//Invoke method to get full screenshot
		d2.getFullScreen();

		driver.close();
	}

}
