package conf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException,  FileNotFoundException{
		prop = new Properties();
		FileInputStream fis = new FileInputStream(".//src//main//java//conf//conf.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", ".//src//main//java//conf//chromedriver");
			driver = new ChromeDriver();
			
		}else if(browserName.equals("firefox")) {
			
		}else if(browserName.equals("IE")){
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = ".//screenshots//"+testCaseName+".png";
		System.out.println("destination file name"+destinationFile);
		FileUtils.copyFile(source, new File(destinationFile));
		
	}
	
}
