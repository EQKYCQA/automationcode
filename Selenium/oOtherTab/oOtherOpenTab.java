package oOtherTab;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class oOtherOpenTab {
	static WebDriver driver;
	

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle().toString());
		
		
		
		String a = "window.open('https://google.com','_blank');";
        ((JavascriptExecutor)driver).executeScript(a);
	}

}
