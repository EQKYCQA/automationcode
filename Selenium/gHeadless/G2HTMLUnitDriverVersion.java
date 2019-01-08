package gHeadless;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class G2HTMLUnitDriverVersion 
{
	@Test
	public void HTMLUnitDriverVersion()
	{		
		//Declaring and initialize  HtmlUnitWebDriver
		HtmlUnitDriver unitDriver = new HtmlUnitDriver(BrowserVersion.CHROME);
		
		unitDriver.setJavascriptEnabled(true);
		
		unitDriver.get("https://staging.ie.kycnet.com/users/login/");
		System.out.println("Title of the page "+ unitDriver.getTitle());
		unitDriver.manage().window().maximize();
		unitDriver.quit();
	}

}
