package oOtherTab;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class o1Import 
{
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eqidashboard:8090/Projects/TestingAutomation");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='EmailId']")).sendKeys("ram.kumar@equiniti-ics.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Godbless@3");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		driver.get("https://eqidashboard:8090/Projects/TestingAutomation");
		Thread.sleep(3000);
		
		createAuto("Risk Factor", "Regression Test of all permissions", "SELENIUM", "VS 2017 Enterprise", "HYBRID", "C#", "Completed", "100.00", "Total Tests-166,Tests Completed-166,Completed % -100. Created Automation script to create user/User roles and assign particular permission and check the access is granted for the user.Each Test method is independent and it will run without affecting other cases.");
		createAuto("Risk Factor", "Functional Test - Schedule, Covenant, Follow-ups", "SELENIUM", "VS 2017 Enterprise", "HYBRID", "C#", "Completed", "100.00", "Total Tests-61, Test Completed-49, Completed % -80. Created Automation script for three functionalities with coveraing all functional check.");
		createAuto("Risk Factor", "Functional Test - FocusList", "SELENIUM", "VS 2017 Enterprise", "HYBRID", "C#", "In Progress", "17.00", "Total Tests-12, Test Completed-2, Completed % -16. Feature file has been created for Focuslist functionalities and still more test method may include in upcoming days.");

		driver.quit();
	}
	
	public static void createAuto(String project,String stage,String tool,String version,String framework,String language,String status,String percentage,String summary) throws IOException, InterruptedException
	{
		driver.navigate().refresh();
	
	String parentWindow = driver.getWindowHandle();
	driver.findElement(By.xpath("//button[@id='AddFeature']")).click();
	Thread.sleep(3000);
	
	switchToChild(parentWindow);
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='-- Select --']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//ul[@id='Project_listbox']//li[text()='"+project+"']")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='--Select Desired Automation --']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//li[text()='Yes']")).click();
	
	driver.findElement(By.xpath("//div[@class='modal-content']//input[@id='Stage']")).sendKeys(stage);
	driver.findElement(By.xpath("//div[@class='modal-content']//input[@id='Tool']")).sendKeys(tool);
	driver.findElement(By.xpath("//div[@class='modal-content']//input[@id='ToolVersion']")).sendKeys(version);
	driver.findElement(By.xpath("//div[@class='modal-content']//input[@id='Framework']")).sendKeys(framework);
	driver.findElement(By.xpath("//div[@class='modal-content']//input[@id='ProgrammingLanguage']")).sendKeys(language);
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='--Select Status --']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[text()='"+status+"']")).click();
	
	driver.findElement(By.xpath("//div[@class='modal-content']//input[@id='ActualStartDate']")).clear();
	driver.findElement(By.xpath("//div[@class='modal-content']//input[@id='ActualStartDate']")).sendKeys("01/01/2018");
	driver.findElement(By.xpath("//div[@class='modal-content']//input[@id='ExpectedCompletionDate']")).clear();
	driver.findElement(By.xpath("//div[@class='modal-content']//input[@id='ExpectedCompletionDate']")).sendKeys("01/02/2019");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id='createTestingAutomation']/div[6]/div[1]/span[2]/span/input[1]")).sendKeys(percentage);
	driver.findElement(By.xpath("//div[@class='modal-content']//input[@id='ActualCompletionDate']")).sendKeys("01/02/2019");
	driver.findElement(By.xpath("//div[@class='modal-content']//textarea[@id='SummaryNote']")).sendKeys(summary);
	
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class='modal-content']//button[@id='addButton']")).click();
	Thread.sleep(3000);
	
	driver.switchTo().window(parentWindow);
	}
	
	
	public static void switchToChild(String window) throws IOException
	 {
		 try
		 {
			 for(String childWindow: driver.getWindowHandles())
			 {
				if(!(childWindow.equals(window)))
				{
					driver.switchTo().window(childWindow);
				}		
			}	
		 }
			catch(Exception e)
			{
				
			}
	 }
		
	public static void switchToParent(String window) throws IOException
	 {
		 try
		 {
			 driver.switchTo().window(window);
			 
		 }
		 catch(Exception e)
			{
			}
		 
	 }
	
}
