package fImage;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.sikuli.script.FindFailed;
	import org.sikuli.script.Pattern;
	import org.sikuli.script.Screen;
	 
	public class F1HTMLImageSikuli 
	{
		
	public static void main(String[] args) throws FindFailed, InterruptedException 
	{	 
	// We have to create Screen class object to access method 
	Screen screen = new Screen();
	 
	// Create object of Pattern class and specify the images path
	Pattern kycUN = new Pattern("D:\\Automation Projects\\AutomationLearning\\ImageObjects\\Username.PNG");
	Pattern lgn = new Pattern("D:\\Automation Projects\\AutomationLearning\\ImageObjects\\Login.PNG");
	Pattern step1 = new Pattern("D:\\Automation Projects\\AutomationLearning\\ImageObjects\\S1.PNG");
	Pattern step2 = new Pattern("D:\\Automation Projects\\AutomationLearning\\ImageObjects\\S2.PNG");
	Pattern action1 = new Pattern("D:\\Automation Projects\\AutomationLearning\\ImageObjects\\Action1.PNG");
	Pattern reject = new Pattern("D:\\Automation Projects\\AutomationLearning\\ImageObjects\\Reject.PNG");
	
	System.setProperty("webdriver.chrome.driver", "D:\\Dump\\Backup\\Automation\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://staging.ie.kycnet.com/reviews/sequencediagram/28541/481/88339/");
	
	
	try
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("sampath");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("KYCnet123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Sikuli wait
		screen.wait(lgn, 10);
		//Sikuli image action
		screen.click(lgn);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		screen.wait(step1, 10);
		screen.click(step1);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		screen.wait(step2, 10);
		screen.click(step2);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		screen.wait(reject, 10);
		screen.click(reject);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		screen.wait(action1, 10);
		screen.click(action1);
	}
	catch(Exception e)
	{
		System.out.println("Exception "+e);	
	}
	driver.close();
	}	 
}