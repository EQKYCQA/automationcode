package dTakesScreenshot;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class d2CaptureScreenshot 
{
	public void captureScreenShot(WebDriver driver)
	{
		try 
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./Screenshots/"+System.currentTimeMillis()+".png"));
		} 
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void captureScreenShot(WebDriver driver, String Name)
	{
		try 
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./Screenshots/"+Name+".png"));
		} 
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	//Robot class helps to take full screen as TakesScreenshot will not capture windows alert and execution browser 
	public void getFullScreen() throws Exception
	{

		// This code will capture screenshot of current screen		
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

		// This will store screenshot on Specific location
		ImageIO.write(image, "png", new File("D:\\Automation Projects\\AutomationLearning\\Screenshots\\FullScreen.png")); 
 
	}
	
	//import org.openqa.selenium.io.FileHandler
	//Call copy method of FileHandler Class which is static method and will ask two argument First is src and another is destination
	public void getScreenUsingFileHandling(WebDriver driver) throws WebDriverException, IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("D:\\Automation Projects\\AutomationLearning\\Screenshots\\ScreenUsingFileHandler.png"));
	}

}
