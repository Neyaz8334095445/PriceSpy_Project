package generic_library;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch implements Framework_constants 
{
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(ge,gv);
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	} 
	
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException 
		{
			if(ITestResult.FAILURE==res.getStatus())
			{
				photo.Capture(driver);
			}
			driver.quit();
		}
}
